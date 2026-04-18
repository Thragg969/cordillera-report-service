package com.grupocordillera.report.dto;

import jakarta.validation.constraints.NotBlank;

public class ReportRequest {

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String type;

    // getters/setters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getType() { return type; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setType(String type) { this.type = type; }
}