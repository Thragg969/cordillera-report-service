package com.grupocordillera.report.dto;

import java.time.LocalDateTime;

public class ReportResponse {

    private Long id;
    private String title;
    private String description;
    private String type;
    private LocalDateTime createdAt;

    public ReportResponse() {}

    public ReportResponse(Long id, String title, String description, String type, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.createdAt = createdAt;
    }

    // getters/setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getType() { return type; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setType(String type) { this.type = type; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}