package com.jos.dem.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/search")
    public String search(){
        return "search";
    }
}
