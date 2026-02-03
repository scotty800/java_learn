package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/")
    public String root() {
        return "Welcome!";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
