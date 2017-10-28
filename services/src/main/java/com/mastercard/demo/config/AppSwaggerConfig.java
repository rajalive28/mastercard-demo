package com.mastercard.demo.config;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.not;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Configuration Class for Swagger UI.
 * <p>
 * Created by M1035845 on 5/25/2017.
 */
@Configuration
@EnableSwagger2
@PropertySource(value = "classpath:application.properties,classpath:${ENV}-application.properties",
        ignoreResourceNotFound = true)
public class AppSwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build();
    }

    @SuppressWarnings("unchecked")
    private Predicate<String> paths() {
        return and(
                not(regex("/error.*")),
                not(regex("/metrics.*")),
                not(regex("/jolokia.*")),
                not(regex("/health.*")),
                not(regex("/env.*")),
                not(regex("/metrics.*")),
                not(regex("/info.*")),
                not(regex("/mappings.*")),
                not(regex("/trace.*")),
                not(regex("/dump.*")),
                not(regex("/heapdump.*")),
                not(regex("/configprops.*")),
                not(regex("/beans.*")),
                not(regex("/autoconfig.*")),
                not(regex("/logfile.*")),
                not(regex("/shutdown.*")),
                not(regex("/application.*")),
                not(regex("/auditevents.*")),
                not(regex("/loggers.*")),
                not(regex("/actuator.*")));
    }

}
