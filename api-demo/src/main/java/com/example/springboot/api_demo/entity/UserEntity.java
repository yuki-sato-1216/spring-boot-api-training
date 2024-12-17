package com.example.springboot.api_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    /*
     * System.out.println();によってコンソール出力する際に以下のフォーマットで出力される
     * デバッグ用だが、オブジェクトを出力する際に各プロパティの内容を確認できるためわかりやすい
     */
    @Override
    public String toString() {
        return String.format("UserEntity::ID=%dName=%sisActive=%b", id, name, isActive);
    }
}
