package com.liumapp.demo.docker.webb.controller;

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

    @GetMapping("")
    public String index () {
        return "this is web b";
    }

}
