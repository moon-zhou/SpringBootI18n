package com.moonzhou.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.moonzhou.filter.MyFilter;
import com.moonzhou.filter.MyFilter2;

/**
 * 
 * 配置过滤器filter<br>
 * 〈功能详细描述〉
 *
 * @author 17080118
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<MyFilter> registerMyFilter() {
        FilterRegistrationBean<MyFilter> registration = new FilterRegistrationBean<MyFilter>();
        
        //注入过滤器
        registration.setFilter(new MyFilter());
        
        //拦截规则
        registration.addUrlPatterns("/*");
        
        //过滤器名称
        registration.setName("MyFilter");
        //是否自动注册 false 取消Filter的自动注册
        registration.setEnabled(false);
        //过滤器顺序
        registration.setOrder(1);
        
        return registration;
    }
    
    @Bean
    public FilterRegistrationBean<MyFilter2> registerMyFilter2() {
        FilterRegistrationBean<MyFilter2> registration = new FilterRegistrationBean<MyFilter2>();
        
        //注入过滤器
        registration.setFilter(new MyFilter2());
        
        //拦截规则
        registration.addUrlPatterns("/*");
        
        //过滤器名称
        registration.setName("MyFilter2");
        //是否自动注册 false 取消Filter的自动注册
        registration.setEnabled(false);
        //过滤器顺序
        registration.setOrder(2);
        
        return registration;
    }
}
