package com.liumapp.demo.docker.eureka.client.b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index (ModelMap model) {
        return "hello , this is client b demo";
    }

}
