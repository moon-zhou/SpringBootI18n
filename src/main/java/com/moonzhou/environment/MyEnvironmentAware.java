package com.moonzhou.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyEnvironmentAware implements EnvironmentAware {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyEnvironmentAware.class);
    
    /**
     * 注意重写的方法 setEnvironment 是在系统启动的时候被执行。
     */
    @Override
    public void setEnvironment(Environment environment) {

        LOGGER.debug("loading environment data...");
        
        // 通过 environment 获取到系统属性.
        LOGGER.debug(environment.getProperty("JAVA_HOME"));

        // 通过 environment 同样能获取到application.properties配置的属性.
        LOGGER.debug(environment.getProperty("spring.jackson.date-format"));

        // 获取到前缀是"spring.datasource." 的属性列表值.
        /*RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,
                "spring.datasource.");
        System.out.println("spring.datasource.url=" + relaxedPropertyResolver.getProperty("url"));
        System.out
                .println("spring.datasource.driverClassName=" + relaxedPropertyResolver.getProperty("driverClassName"));*/
    }
}