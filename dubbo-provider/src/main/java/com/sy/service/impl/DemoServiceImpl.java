package com.sy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sy.service.DemoService;

import java.text.MessageFormat;

@Service(version = "${test.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayName(String name) {
        String str = MessageFormat.format("My name is {0}", name);
        return str;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
