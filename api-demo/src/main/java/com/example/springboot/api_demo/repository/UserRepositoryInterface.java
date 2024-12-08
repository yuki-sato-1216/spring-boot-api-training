package com.example.springboot.api_demo.repository;

import java.util.List;

import com.example.springboot.api_demo.entity.UserEntity;

public interface UserRepositoryInterface {
  public List<UserEntity> findAll();
}
