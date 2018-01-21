package com.moonzhou.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 监听Session的创建与销毁
 *
 */
//@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyHttpSessionListener.class);
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOGGER.debug("Session 被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        LOGGER.debug("ServletContex初始化");
    }

}
