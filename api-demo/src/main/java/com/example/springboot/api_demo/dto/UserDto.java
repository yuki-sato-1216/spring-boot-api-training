package com.example.springboot.api_demo.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private boolean isActive;

    public UserDto(Integer id, String name, String email, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }
}