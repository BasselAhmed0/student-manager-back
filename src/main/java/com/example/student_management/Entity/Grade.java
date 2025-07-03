package com.example.student_management.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "grades")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Grade extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;

    @Column(nullable = false)
    private String type; // e.g., "Exam"

    @Column(nullable = false)
    private double score;

    @Column(nullable = false)
    private LocalDate date;

    public Grade(Enrollment enrollment, String type, double score, LocalDate date) {
        this.enrollment = enrollment;
        this.type = type;
        this.score = score;
        this.date = date;
    }
}
