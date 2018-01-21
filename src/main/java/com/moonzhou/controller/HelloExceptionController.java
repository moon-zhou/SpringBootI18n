package com.moonzhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class HelloExceptionController {
    
    /**
     * 
     * 功能描述: 测试异常被捕捉到<br>
     * http://localhost:8080/exception/zeroException
     *
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("/zeroException")
    private int throwException() {
        
        return 100 / 0;
    }
}
