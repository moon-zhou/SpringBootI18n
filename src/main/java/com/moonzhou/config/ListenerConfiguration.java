package com.moonzhou.config;

import java.util.EventListener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.moonzhou.listener.MyHttpSessionListener;
import com.moonzhou.listener.MyServletContextListener;

/**
 * 
 * 配置监听器<br>
 * 〈功能详细描述〉
 *
 * @author 17080118
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Configuration
public class ListenerConfiguration {
    @Bean
    public ServletListenerRegistrationBean<EventListener> initMyServletContextListener() {
        ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyServletContextListener());
        registrationBean.setOrder(1);
        return registrationBean;
    }
    
    @Bean
    public ServletListenerRegistrationBean<EventListener> initMyHttpSessionListener() {
        ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyHttpSessionListener());
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
