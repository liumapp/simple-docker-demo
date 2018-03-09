package com.liumapp.demo.docker.weba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 3/6/18 9:56 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/a")
public class IndexController {

    @Value("${custom.activeInfo}")
    private String activeInfo;

    @GetMapping("")
    public String index () {
        return "this is web a , and active info is : " + activeInfo;
    }

}
