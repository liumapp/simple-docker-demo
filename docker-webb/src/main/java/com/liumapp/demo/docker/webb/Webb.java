package com.liumapp.demo.docker.webb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 3/7/18 10:27 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Webb {

    public static void main(String[] args) {
        SpringApplication.run(Webb.class , args);
    }

}
