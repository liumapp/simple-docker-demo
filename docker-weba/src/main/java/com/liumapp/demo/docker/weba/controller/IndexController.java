package com.liumapp.demo.docker.weba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 3/6/18 9:56 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String index () {
        return "success";
    }

}
