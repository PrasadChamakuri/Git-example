package com.example.Git.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/b")
    public String hai(){
        return "hello world";
    }
}
