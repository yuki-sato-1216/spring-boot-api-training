package com.example.springboot.api_demo.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springboot.api_demo.dto.UserDto;
import com.example.springboot.api_demo.service.UserService;

@Component
public class UserUsecase implements UserUsecaseInterface {
    @Autowired
    UserService service;

    public List<UserDto> findUserList() {
        return service.findUserList();
    }
}
