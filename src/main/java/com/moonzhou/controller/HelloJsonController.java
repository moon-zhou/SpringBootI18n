package com.moonzhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonzhou.bean.DemoBean;

@RestController
@RequestMapping("/testJson")
public class HelloJsonController {
    
    @RequestMapping("/getJsonDemo")
    private DemoBean getDemo() {
        DemoBean demo = new DemoBean();
        demo.setId(111);
        demo.setName("李牧羊");
        
        return demo;
    }
}
