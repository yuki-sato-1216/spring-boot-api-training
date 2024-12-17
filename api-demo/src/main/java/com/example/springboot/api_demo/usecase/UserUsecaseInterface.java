package com.example.springboot.api_demo.usecase;

import java.util.List;

// import com.example.springboot.api_demo.dto.UserRequestDto;
import com.example.springboot.api_demo.dto.UserResponseDto;

public interface UserUsecaseInterface {
    List<UserResponseDto> findUserList();
    // TODO: 以下のインターフェースのコメントアウトを外して、UserUsecaseの処理を実装する
    // UserResponseDto findUserById(Long id);
    // UserResponseDto addUser(UserRequestDto dto);
}
