package com.mastercard.demo.services.impl;

import com.mastercard.demo.entities.IOTRuleEntity;
import com.mastercard.demo.model.CreateIOTRuleResponseVO;
import com.mastercard.demo.model.IotSensorDataResponse;
import com.mastercard.demo.model.SensorValue;
import com.mastercard.demo.respository.IOTRuleRepository;
import com.mastercard.demo.services.IOTRuleService;
import dsl.IOTScenarioRuleParser;
import dsl.IOTSecnarioAST;
import org.apache.commons.jexl3.*;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scala.util.parsing.combinator.Parsers;

import java.util.List;
import java.util.UUID;

@Component
public class IOTRuleServiceImpl implements IOTRuleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    private static final JexlEngine jexl = new JexlBuilder().cacheThreshold(1024).cache(512).create();

    MqttClient myClient;
    static final String BROKER_URL = "tcp://localhost:11883";
    static final String topic = "iot/test";
    static final String clientId = "rohitLaptop";
//

    @Autowired
    IOTRuleRepository iotRuleRepository;

    @Override
    public CreateIOTRuleResponseVO saveRule(String ruleContent) {
        CreateIOTRuleResponseVO createIOTRuleResponseVO = new CreateIOTRuleResponseVO();
        try{
            Parsers.ParseResult result = IOTScenarioRuleParser
                    .parseSubstring(IOTScenarioRuleParser.rule(), ruleContent);
            if(!result.successful()){
                String msg = "The parser failed to parse the document. Incorrect syntax.";
                LOGGER.error(msg);
                LOGGER.error("Rule document content is: \n" + ruleContent);
                createIOTRuleResponseVO.setMessage("Rule not created");
                createIOTRuleResponseVO.setStatus("error");
            }else{
                IOTSecnarioAST.Rule rule =  (IOTSecnarioAST.Rule)result.get();
                IOTRuleEntity iotRuleEntity = new IOTRuleEntity();
                iotRuleEntity.setRuleId(UUID.randomUUID().toString());
                iotRuleEntity.setRuleName(rule.ruleName());
                iotRuleEntity.setRuleContent(ruleContent);
                iotRuleRepository.save(iotRuleEntity);
                LOGGER.info("Rule saved successfully");
                createIOTRuleResponseVO.setMessage("Rule created successfully");
                createIOTRuleResponseVO.setStatus("success");
            }
        }catch (Exception e){
            createIOTRuleResponseVO.setMessage("Rule created successfully: "+e.getMessage());
            createIOTRuleResponseVO.setStatus("error");
        }
        return createIOTRuleResponseVO;
    }

    @Override
    public IotSensorDataResponse postSensorData(SensorValue sensorValue) {
        IotSensorDataResponse iotSensorDataResponse = new IotSensorDataResponse();
        List<IOTRuleEntity> iotRuleEntities = (List<IOTRuleEntity>) iotRuleRepository.findAll();
        LOGGER.info("size: {}",iotRuleEntities.size());
        iotRuleRepository.findAll().forEach(iotRuleEntity -> {
            Parsers.ParseResult result = IOTScenarioRuleParser
                    .parseSubstring(IOTScenarioRuleParser.rule(), iotRuleEntity.getRuleContent());
            IOTSecnarioAST.Rule rule =  (IOTSecnarioAST.Rule)result.get();
            LOGGER.info("IOT Rule Found Rule Name: {}", rule.ruleName());
            if (evaluateRule(rule, sensorValue)){
                LOGGER.info("Rule Fired: {}", rule.ruleName());
                performAction(rule);
            }
        });
        iotSensorDataResponse.setStatus("success");
        iotSensorDataResponse.setMessage("successfully posted data");
        return iotSensorDataResponse;
    }

    private void performAction(IOTSecnarioAST.Rule rule) {
       String command = rule.ruleBody().action().actionVerb();
       if (command.trim().equalsIgnoreCase("TURN_ON")){
           sendCommand(1);
       }
        if (command.trim().equalsIgnoreCase("TURN_OFF")){
            sendCommand(0);
        }
    }

    private boolean evaluateRule(IOTSecnarioAST.Rule rule, SensorValue sensorValue) {
        String evalString = rule.ruleBody().condition().conditionalExpressionString();
        LOGGER.info("ConditionString is : {}", evalString);
        JexlExpression e = jexl.createExpression(evalString);
        JexlContext jc = new MapContext();
        jc.set(sensorValue.getSensorName(), sensorValue.getSensorValue());
        return (boolean) e.evaluate(jc);
    }

    private void sendCommand(int i) {
        try {
            myClient = new MqttClient(BROKER_URL, clientId);
            myClient.connect();
            //  myClient.connect(connOpt);
            if (myClient.isConnected())
                System.out.println("Connected to " + BROKER_URL);
            MqttMessage mqttMessage = new MqttMessage(String.valueOf(i).getBytes());
            myClient.publish(topic, mqttMessage);
            myClient.disconnect();
            LOGGER.info("Message Sent Successfully: {}", String.valueOf(i));
        } catch (MqttException e) {
            e.printStackTrace();

        }
    }
}
