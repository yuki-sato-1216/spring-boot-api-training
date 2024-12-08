package com.example.springboot.api_demo.service;

import java.util.List;

import com.example.springboot.api_demo.dto.UserDto;

public interface UserServiceInterface {
    List<UserDto> findUserList();
}
