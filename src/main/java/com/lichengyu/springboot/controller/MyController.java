package com.lichengyu.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @PostMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!!";
    }
}
