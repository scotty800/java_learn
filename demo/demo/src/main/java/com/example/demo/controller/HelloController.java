package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "ok");
        return response;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return new User("User" + id, 20 + id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return user;
    }
}
