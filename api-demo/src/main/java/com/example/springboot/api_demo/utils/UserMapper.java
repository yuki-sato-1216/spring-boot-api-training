package com.example.springboot.api_demo.utils;

import org.springframework.stereotype.Component;

import com.example.springboot.api_demo.dto.UserDto;
import com.example.springboot.api_demo.entity.UserEntity;

@Component
public class UserMapper {
    public UserDto mapToDto(UserEntity entity) {
        return new UserDto(entity.getId(), entity.getName(), entity.getEmail(), entity.isActive());
    }
}
