package com.example.student_management.Controller;

import com.example.student_management.Entity.Course;
import com.example.student_management.IService.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.findById(id);
    }


    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.save(course);
    }

    // Bulk create courses
    @PostMapping("/bulk")
    public List<Course> createCoursesBulk(@RequestBody List<Course> courses) {
        return courses.stream().map(courseService::save).toList();
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        course.setId(id);
        return courseService.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteById(id);
    }
}
