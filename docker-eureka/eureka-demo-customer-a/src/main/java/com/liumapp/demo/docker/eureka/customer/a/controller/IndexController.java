package com.liumapp.demo.docker.eureka.customer.a.controller;

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

    @RequestMapping(path = "")
    public String index (ModelMap model) {
        return "Hello , this is customer a .";
    }

}
