package com.liumapp.demo.docker.eureka.customer.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liumapp on 1/21/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer" , method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://DEMO-CLIENT-A", String.class).getBody();
    }

}
