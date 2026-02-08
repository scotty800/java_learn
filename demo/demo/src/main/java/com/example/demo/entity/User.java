package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom est obligatoire")
    private String name;

    @Min(value = 1, message = "L' age doit être supérieur à 0")
    private Integer age;

    private String password;
    private String role;

    public User() {}

    public User(String name, Integer age, String password, String role) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.role = role;
    }


    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getPassword() { return password; }
    public void  setPassword(String password) { 
        this.password = password; 
    }

    public String getRole() { return role; }
    public void setRole(String role) { 
        this.role = role; 
    }
}
