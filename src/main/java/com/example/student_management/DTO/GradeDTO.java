package com.example.student_management.DTO;

import java.time.LocalDate;

public class GradeDTO {
    private Long id;
    private Long enrollmentId;
    private String type;
    private double score;
    private LocalDate date;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(Long enrollmentId) { this.enrollmentId = enrollmentId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}

