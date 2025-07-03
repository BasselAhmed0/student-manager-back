package com.example.student_management.IService;

import com.example.student_management.Entity.Course;
import java.util.List;

/**
 * Service interface for managing Course entities.
 */
public interface CourseService {
    /**
     * Save a course entity.
     * @param course the course to save
     * @return the saved course
     */
    Course save(Course course);

    /**
     * Find a course by its ID.
     * @param id the course ID
     * @return the course if found
     */
    Course findById(Long id);

    /**
     * Get all courses.
     * @return list of all courses
     */
    List<Course> findAll();

    /**
     * Delete a course by its ID.
     * @param id the course ID
     */
    void deleteById(Long id);
}
