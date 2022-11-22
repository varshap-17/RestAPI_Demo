package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demoController {
    @GetMapping("/get")
    public String getMessage(String name){
        return "Hello "+name+" Welcome to BridgeLabz";
    }
}
