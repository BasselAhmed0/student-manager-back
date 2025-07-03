package com.example.student_management.IService;

import com.example.student_management.Entity.Enrollment;
import java.util.List;

/**
 * Service interface for managing Enrollment entities.
 */
public interface EnrollmentService {
    /**
     * Save an enrollment entity.
     * @param enrollment the enrollment to save
     * @return the saved enrollment
     */
    Enrollment save(Enrollment enrollment);

    /**
     * Find an enrollment by its ID.
     * @param id the enrollment ID
     * @return the enrollment if found
     */
    Enrollment findById(Long id);

    /**
     * Get all enrollments.
     * @return list of all enrollments
     */
    List<Enrollment> findAll();

    /**
     * Delete an enrollment by its ID.
     * @param id the enrollment ID
     */
    void deleteById(Long id);
}
