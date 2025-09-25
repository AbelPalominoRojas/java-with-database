package com.ironman.entity;

import java.time.LocalDateTime;

public class Publisher {
    // Attributes
    private Integer id;
    private String publisherCode;
    private String publisherName;
    private LocalDateTime createdAt;
    private Integer status;

    // Constructors
    public Publisher() {}

    public Publisher(Integer id, String publisherCode, String publisherName, LocalDateTime createdAt, Integer status) {
        this.id = id;
        this.publisherCode = publisherCode;
        this.publisherName = publisherName;
        this.createdAt = createdAt;
        this.status = status;
    }

    // Getters and Setters (Encapsulation)


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublisherCode() {
        return publisherCode;
    }

    public void setPublisherCode(String publisherCode) {
        this.publisherCode = publisherCode;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
