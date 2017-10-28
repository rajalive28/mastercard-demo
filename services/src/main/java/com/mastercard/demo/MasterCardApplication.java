package com.mastercard.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@SpringBootApplication
@PropertySource(value = {"classpath:application.properties","classpath:${ENV}-application.properties"}, ignoreResourceNotFound = true)
public class MasterCardApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MasterCardApplication.class, args);
    }
}
