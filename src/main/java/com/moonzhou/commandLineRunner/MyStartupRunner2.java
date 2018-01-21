package com.moonzhou.commandLineRunner;

import org.apache.logging.log4j.core.config.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class MyStartupRunner2 implements CommandLineRunner {
    private final static Logger LOGGER = LoggerFactory.getLogger(MyStartupRunner2.class);
    @Override
    public void run(String... args) throws Exception {
        LOGGER.debug(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 order 1 <<<<<<<<<<<<<");
    }
  
}