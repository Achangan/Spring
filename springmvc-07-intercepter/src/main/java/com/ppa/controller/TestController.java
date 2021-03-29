package com.ppa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/ok")
    public String test(){
        System.out.println("TestController====test执行了");
        return "ok";
    }
}
