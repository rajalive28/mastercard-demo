package com.mindtree.assetplus.brl.helper.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 * This class has been specifically designed to share the Spring applicationContext with Guice modules. Do **NOT**
 * use for any other purpose. Unknown side-effects may occur.
 * <p>
 * Created by M1020513 on 1/1/2017.
 */
public class ApplicationContextUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextUtil.class);

    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        LOGGER.info("Application context set for Guice consumers.");
        context = applicationContext;
    }
}
