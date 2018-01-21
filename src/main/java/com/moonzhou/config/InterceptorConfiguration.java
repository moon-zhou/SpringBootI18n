package com.moonzhou.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.moonzhou.interceptor.MyInterceptor;
import com.moonzhou.interceptor.MyInterceptor2;

/**
 * 
 * 配置拦截器<br> 
 * 〈功能详细描述〉
 *
 * @author 17080118
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new MyInterceptor2());
    }
}
