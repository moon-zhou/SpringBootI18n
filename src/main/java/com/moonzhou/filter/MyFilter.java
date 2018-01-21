package com.moonzhou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
*
* 使用注解标注过滤器
* <code>@WebFilter</code>将一个实现了javax.servlet.Filter接口的类定义为过滤器
* 属性filterName声明过滤器的名称,可选
* 属性urlPatterns指定要过滤的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
* 
* 
* <code>@Component</code> 这个注解的目的是将filter交给容器来处理。也就是让filter起作用
* <code>@ServletComponentScan</code> 这个使用来扫描<code>@WebFilter</code> 的让<code>@WebFilter</code>起作用。
* 当然对于servlet线管注解也是可以的。这个@ServletComponentScan最好写在Apllication这个上面，通用配置。
* <code>@WebFilter</code> 这个用处显而易见，针对于什么链接做过滤，filter的名称是为什么。
* SpringMVC中还可以设置web.xml
* 
* @version v.0.1
*/
//@ServletComponentScan
//@WebFilter(filterName="myFilter",urlPatterns="/*") // 需要web.xml配置version 3.0及以上
@Component
public class MyFilter implements Filter {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyFilter.class);
    
    @Override
    public void init(FilterConfig config) throws ServletException {
        LOGGER.debug("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        LOGGER.debug("执行过滤操作");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        LOGGER.debug("过滤器销毁");
    }
}
