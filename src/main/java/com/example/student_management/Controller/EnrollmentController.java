package com.example.student_management.Controller;

import com.example.student_management.Entity.Enrollment;
import com.example.student_management.IService.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrollments")
@CrossOrigin(origins = "http://localhost:4200")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.findAll();
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentById(@PathVariable Long id) {
        return enrollmentService.findById(id);
    }


    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.save(enrollment);
    }

    // Bulk create enrollments
    @PostMapping("/bulk")
    public List<Enrollment> createEnrollmentsBulk(@RequestBody List<Enrollment> enrollments) {
        return enrollments.stream().map(enrollmentService::save).toList();
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable Long id, @RequestBody Enrollment enrollment) {
        Enrollment existingEnrollment = enrollmentService.findById(id);
        if (existingEnrollment != null) {
            return enrollmentService.save(enrollment);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable Long id) {
        enrollmentService.deleteById(id);
    }
}
