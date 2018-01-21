package com.moonzhou.commandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * 在实际项目开发中，我们会有在项目服务启动的时候就去加载一些数据或做一些事情这样的需求。 <br> 
 * 为了解决这样的问题，Spring Boot 为我们提供了一个方法，通过实现接口 CommandLineRunner 来实现。
 *
 * 也可以在application配置@ComponentScan(basePackages={"xxx.package1","xxx.package2"})，目前不需要
 *
 * @author 17080118
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Component
@Order(value=2)
public class MyStartupRunner1 implements CommandLineRunner {
  
    private final static Logger LOGGER = LoggerFactory.getLogger(MyStartupRunner1.class);
    
    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            LOGGER.debug("arg: " + arg);
        }
        LOGGER.debug(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 order 2 <<<<<<<<<<<<<");
    }
  
}