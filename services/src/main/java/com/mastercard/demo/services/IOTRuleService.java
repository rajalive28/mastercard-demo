package com.mastercard.demo.services;

import com.mastercard.demo.model.CreateIOTRuleResponseVO;
import com.mastercard.demo.model.IotSensorDataResponse;
import com.mastercard.demo.model.SensorValue;

public interface IOTRuleService {
    CreateIOTRuleResponseVO saveRule(String ruleContent);

    IotSensorDataResponse postSensorData(SensorValue sensorValue);
}
