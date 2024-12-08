package com.example.springboot.api_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.api_demo.dto.UserDto;
import com.example.springboot.api_demo.usecase.UserUsecase;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserUsecase usecase;

	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers() {
		final List<UserDto> users = this.usecase.findUserList();
		return ResponseEntity.ok(users);
	}

    // @GetMapping("/{id}")
    // public ResponseEntity<UserDto> getUserById(@PathVariable Integer id) {
	// 	// TODO: 指定したIDのユーザー取得する
    // }

	// @PostMapping
    // public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
	// 	// TODO: ユーザーを作成する
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<UserDto> updateUser(@PathVariable Integer id, @RequestBody UserDto userDto) {
	// 	// TODO: 指定したIDのユーザーを更新する
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
	// 	// TODO: 指定したIDのユーザーを削除する
    // }
}