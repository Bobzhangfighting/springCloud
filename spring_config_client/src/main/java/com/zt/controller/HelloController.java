package com.zt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangtao on 2019/1/8.
 */
@RestController
public class HelloController {
    @Value("${from}")
    String from;

    @RequestMapping(value = "/from")
    public String from(){
        return this.from;
    }
}
