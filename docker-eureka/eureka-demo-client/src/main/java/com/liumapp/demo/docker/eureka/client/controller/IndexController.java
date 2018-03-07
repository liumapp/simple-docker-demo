package com.liumapp.demo.docker.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by liumapp on 1/19/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class IndexController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/")
    public String index () {
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("host is : " + instance.getHost() + " and service_id is : " + instance.getServiceId());
        return "Hello World";
    }

}
