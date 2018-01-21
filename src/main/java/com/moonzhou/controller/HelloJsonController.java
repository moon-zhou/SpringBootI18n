package com.moonzhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonzhou.dto.DemoDto;

@RestController
@RequestMapping("/testJson")
public class HelloJsonController {
    
    @RequestMapping("/getJsonDemo")
    private DemoDto getDemo() {
        DemoDto demo = new DemoDto();
        demo.setId(111);
        demo.setName("李牧羊");
        
        return demo;
    }
}
