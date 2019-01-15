package com.zt.controller;

import com.zt.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangtao on 2019/1/5.
 */
@RestController
public class HelloController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        System.out.println("来了这里了");
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
