package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.dto.UserDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.demo.dto.LoginRequest;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService service;
    private final PasswordEncoder encoder;

    public AuthController(UserService service, PasswordEncoder encoder) {
        this.service = service;
        this.encoder = encoder;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        User user = service.findEntityByName(request.getName());

        if(!encoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Identifiants invalides");
        }

        return "JWT_TOKEN_SIMULE";
    }

}