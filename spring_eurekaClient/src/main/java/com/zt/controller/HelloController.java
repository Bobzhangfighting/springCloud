package com.zt.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangtao on 2019/1/5.
 */

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(HelloController.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){

        return "hi"+name+",i am from port:"+port;
    }

}
