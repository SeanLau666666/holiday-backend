package com.tenji.holidayDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/say")
    public String sayHello(){
        return "hello";
    }

}
