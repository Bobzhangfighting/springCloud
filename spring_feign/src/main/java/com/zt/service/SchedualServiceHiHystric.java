package com.zt.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangtao on 2019/1/5.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry"+name;
    }
}
