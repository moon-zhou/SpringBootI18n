package com.moonzhou.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用@WebListener注解，实现ServletContextListener接口
 *
 * 
 */
//@WebListener
public class MyServletContextListener implements ServletContextListener {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyServletContextListener.class);
    
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        LOGGER.debug("ServletContex销毁");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        LOGGER.debug("ServletContex初始化");
    }
}