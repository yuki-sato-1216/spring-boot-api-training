package com.example.springboot.api_demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /*
     * System.out.println();によってコンソール出力する際に以下のフォーマットで出力される
     * デバッグ用だが、オブジェクトを出力する際に各プロパティの内容を確認できるためわかりやすい
     */
    @Override
    public String toString() {
        return String.format("ID=%d\nName=%s\nisActive=%b", id, name, isActive);
    }

    @PrePersist
    private void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.setCreatedAt(now);
        this.setUpdatedAt(now);
    }

    @PreUpdate
    private void onUpdate() {
        this.setUpdatedAt(LocalDateTime.now());
    }
}
