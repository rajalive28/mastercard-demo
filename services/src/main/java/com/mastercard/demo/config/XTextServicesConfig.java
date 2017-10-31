package com.mastercard.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.xtext.example.mydsl.web.MyDslServlet;


@Configuration
public class XTextServicesConfig {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Bean
    @Autowired
    public ServletRegistrationBean xtextServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyDslServlet(), "/xtext-service/*");
        bean.setName("XtextService");
        bean.setOrder(ServletRegistrationBean.HIGHEST_PRECEDENCE);
        // just adding a listener to debug.
        //webApplicationContext.getServletContext().addListener(httpSessionCollector);

        return bean;
    }


//    @Bean
//    HttpSessionCollector httpSessionCollector() {
//        return new HttpSessionCollector ();
//    }
}
