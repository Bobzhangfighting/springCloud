package com.zt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangtao on 2019/1/4.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        System.out.println("hahahahahahahahhah");
      //  return restTemplate.getForObject("http://SERVICE-HI/hi?name"+name,String.class);

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://SERVICE-HI/hi?name"+name, String.class);
        String body = responseEntity.getBody();
        //HttpStatus statusCode = responseEntity.getStatusCode();
        //int statusCodeValue = responseEntity.getStatusCodeValue();
        //HttpHeaders headers = responseEntity.getHeaders();

        return body;
    }
}
