package com.moonzhou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFilter2 extends HttpFilter implements Filter {

    /**
     */
    private static final long serialVersionUID = -693633721147878232L;

    private final static Logger LOGGER = LoggerFactory.getLogger(MyFilter2.class);
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        super.doFilter(request, response, chain);
        
        // 将请求转换成HttpServletRequest 请求 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
//        String path = req.getContextPath();
        
        LOGGER.debug("filter2 dofilter...");
        LOGGER.debug("request info {}.", req);
        LOGGER.debug("response info {}.", resp);
        
    }



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        super.init(filterConfig);
        
        LOGGER.debug("filter2 init...");
    }



    @Override
    public void destroy() {
        LOGGER.debug("filter2 destroy...");
    }

}
