package com.tenji.holiday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="/holiday")
public class test1 {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(test1.class, args);
    }

    @GetMapping(value="/index")
    public String index() {
        return "Hello World!";
    }
}
