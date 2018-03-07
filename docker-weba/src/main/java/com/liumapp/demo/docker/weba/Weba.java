package com.liumapp.demo.docker.weba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 3/6/18 8:59 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Weba {

    public static void main(String[] args) {
        SpringApplication.run(Weba.class , args);
    }

}
