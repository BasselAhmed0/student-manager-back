package com.example.student_management.IService;

import com.example.student_management.Entity.Grade;
import java.util.List;

/**
 * Service interface for managing Grade entities.
 */
public interface GradeService {
    /**
     * Save a grade entity.
     * @param grade the grade to save
     * @return the saved grade
     */
    Grade save(Grade grade);

    /**
     * Find a grade by its ID.
     * @param id the grade ID
     * @return the grade if found
     */
    Grade findById(Long id);

    /**
     * Get all grades.
     * @return list of all grades
     */
    List<Grade> findAll();

    /**
     * Delete a grade by its ID.
     * @param id the grade ID
     */
    void deleteById(Long id);
}
