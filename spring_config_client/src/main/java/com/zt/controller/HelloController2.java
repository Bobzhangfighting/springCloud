package com.zt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangtao on 2019/1/8.
 */
@RefreshScope
@RestController
public class HelloController2 {

    @Value("${from}")
    String from;

    @Autowired
    private Environment env;


    @RequestMapping(value = "/from2")
    public String from2(){
        return env.getProperty("from");
    }
}
