package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    /*
    原来的方式:http://localhost:8080/add?a=1&b=2
    RestFul:http://localhost:8080/add/a/b
     */
//    @RequestMapping("/add/{a}/{b}")
    @GetMapping("/add/{a}/{b}")
    public String test01(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果1为"+res);

        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test02(@PathVariable int a,@PathVariable String  b, Model model){
        String  res = a + b;
        model.addAttribute("msg","结果2为"+res);

        return "test";
    }
}
