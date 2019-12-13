package com.sy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sy.service.DemoService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = Logger.getLogger(DemoController.class);

    @Reference(version = "${test.service.version}")
    private DemoService demoService;

    @GetMapping("/sayName/{name}")
    public String sayName(@PathVariable("name")String name){
        logger.info(String.format("入参：%s",name));
        return demoService.sayName(name);
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return demoService.sayHello();
    }
}
