package com.example.student_management.IService;

import com.example.student_management.Entity.Student;
import java.util.List;

/**
 * Service interface for managing Student entities.
 */
public interface StudentService {
    /**
     * Save a student entity.
     * @param student the student to save
     * @return the saved student
     */
    Student save(Student student);

    /**
     * Find a student by its ID.
     * @param id the student ID
     * @return the student if found
     */
    Student findById(Long id);

    /**
     * Get all students.
     * @return list of all students
     */
    List<Student> findAll();

    /**
     * Delete a student by its ID.
     * @param id the student ID
     */
    void deleteById(Long id);
}
