package com.mindtree.assetplus.brl.helper.guice;


import com.mindtree.assetplus.brl.helper.util.ApplicationContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by M1020513 on 1/1/2017.
 */
@Component
public class GuiceIntegrationHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(GuiceIntegrationHelper.class);
    @Autowired
    private ApplicationContext context;

    @EventListener
    public void init(ContextRefreshedEvent contextRefreshedEvent) {
        LOGGER.info("Setting application Context for Guice consumers.");
        ApplicationContextUtil.setApplicationContext(context);
    }
}
