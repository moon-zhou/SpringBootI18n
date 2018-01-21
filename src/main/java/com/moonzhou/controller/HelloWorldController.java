package com.moonzhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * spring boot test controller
 * 不能使用RestController，否则Controller中的方法无法返回jsp页面，
 * 配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
 * @author 17080118
 *
 */
@Controller
public class HelloWorldController {

    // 映射至对应的html/jsp
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    /**
     * 测试有目录的页面
     * @return
     */
    @RequestMapping(value = {"", "index2"}, method = RequestMethod.GET)
    public String index2() {
    	return "welcome/index2";
    }
    
    /**
     * index.jsp不会被映射到
     * 配置项
     * spring.thymeleaf.suffix=.jsp
     * @return
     */
    @RequestMapping(value = {"", "index3"}, method = RequestMethod.GET)
    public String index3() {
    	return "welcome/index3";
    }
}