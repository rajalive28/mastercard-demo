package com.mastercard.demo.controllers;

import com.mastercard.demo.model.CreateIOTRuleRequestVO;
import com.mastercard.demo.model.CreateIOTRuleResponseVO;
import com.mastercard.demo.model.IotSensorDataResponse;
import com.mastercard.demo.model.SensorValue;
import com.mastercard.demo.services.IOTRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/iot")
public class IOTRuleController {

    @Autowired
    IOTRuleService iotRuleService;

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/rule", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public CreateIOTRuleResponseVO getAccountByAccountNo(@RequestBody CreateIOTRuleRequestVO createIOTRuleRequestVO) {
        CreateIOTRuleResponseVO createIOTRuleResponseVO = iotRuleService.saveRule(createIOTRuleRequestVO.getRuleContent());
        return createIOTRuleResponseVO;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/sensorvalue", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public IotSensorDataResponse postSensorValue(@RequestBody SensorValue sensorValue) {
        IotSensorDataResponse iotSensorDataResponse = iotRuleService.postSensorData(sensorValue);
        return iotSensorDataResponse;
    }


}
