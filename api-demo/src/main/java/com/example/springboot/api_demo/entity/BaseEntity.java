package com.example.springboot.api_demo.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    /// フォーマット: yyyy-MM-dd HH:mm:ss
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    private void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.setCreatedAt(LocalDateTime.parse(now.format(FORMATTER), FORMATTER));
        this.setUpdatedAt(LocalDateTime.parse(now.format(FORMATTER), FORMATTER));
    }

    @PreUpdate
    private void onUpdate() {
        LocalDateTime now = LocalDateTime.now();
        this.setUpdatedAt(LocalDateTime.parse(now.format(FORMATTER), FORMATTER));
    }
}
