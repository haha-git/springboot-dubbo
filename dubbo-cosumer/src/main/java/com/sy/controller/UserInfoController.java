package com.sy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sy.entity.UserInfo;
import com.sy.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Reference(version = "${test.service.version}")
    private UserInfoService userInfoService;

    @GetMapping("/list")
    public List<UserInfo> list(){
        return userInfoService.list();
    }
}
