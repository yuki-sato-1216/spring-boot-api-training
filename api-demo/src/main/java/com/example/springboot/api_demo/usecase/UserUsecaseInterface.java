package com.example.springboot.api_demo.usecase;

import java.util.List;

import com.example.springboot.api_demo.dto.UserDto;

public interface UserUsecaseInterface {
    List<UserDto> findUserList();
}
