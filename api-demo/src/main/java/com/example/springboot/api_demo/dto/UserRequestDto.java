package com.example.springboot.api_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserRequestDto {
    /*
     * リクエストに必要なプロパティのみ用意する
     */
    private String name;
    private String email;
    private boolean isActive;
}
