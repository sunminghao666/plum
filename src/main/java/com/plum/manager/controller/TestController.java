package com.plum.manager.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plum.manager.service.TestService;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "Welcome to start SpringBoot!";
    }

    @RequestMapping("/helloMysql")
    public String helloMysql() {

        return testService.test();
    }
}
