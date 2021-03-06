package com.liumapp.demo.docker.webc.controller;

import com.liumapp.demo.docker.webc.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liumapp on 3/8/18 2:37 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private Guest guest;

    @GetMapping("/")
    public String index (ModelMap model) {

        model.addAttribute("name" , guest.getName());
        model.addAttribute("sex" , guest.getSex());
        return "index";
    }

}
