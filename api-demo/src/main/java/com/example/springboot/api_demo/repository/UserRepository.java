package com.example.springboot.api_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.api_demo.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
  // カスタムのSQLを組みたい場合はここへ以下のようなQueryを書いたメソッドを追加する
  // @Query("SELECT u FROM UserEntity u WHERE u.name LIKE %?1%")
  // List<UserEntity> findByNameContains(String name);
}
