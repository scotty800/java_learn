package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDTO create(@Valid @RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return service.create(user);
    }

    @GetMapping
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteUserById(id);
        return "Utilisateur supprimé avec succès";
    }
}

