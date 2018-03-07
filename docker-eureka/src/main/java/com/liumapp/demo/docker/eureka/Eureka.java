package com.liumapp.demo.docker.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 3/7/18 10:24 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class , args);
    }

}
