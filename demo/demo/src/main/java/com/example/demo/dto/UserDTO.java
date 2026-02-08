package com.example.demo.dto;

public class UserDTO {

    private Long id;
    private String name;
    private Integer age;
    private String password;
    private String role;

    public UserDTO() {}

    public UserDTO(Long id, String name, Integer age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getRole() { 
        return role;
    }
}