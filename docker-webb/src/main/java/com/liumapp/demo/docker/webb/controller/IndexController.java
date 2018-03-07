package com.liumapp.demo.docker.webb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 3/7/18 10:27 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/b")
public class IndexController {

    @Value("${custom.activeInfo}")
    private String activeInfo;

    @GetMapping("")
    public String index () {
        return "this is web b , and active info is : " + activeInfo;
    }

}
