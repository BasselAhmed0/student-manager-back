package com.example.student_management.Controller;

import com.example.student_management.Entity.Grade;
import com.example.student_management.IService.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/grades")
@CrossOrigin(origins = "http://localhost:4200")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.findAll();
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable Long id) {
        return gradeService.findById(id);
    }


    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeService.save(grade);
    }

    // Bulk create grades
    @PostMapping("/bulk")
    public List<Grade> createGradesBulk(@RequestBody List<Grade> grades) {
        return grades.stream().map(gradeService::save).toList();
    }

    @PutMapping("/{id}")
    public Grade updateGrade(@PathVariable Long id, @RequestBody Grade grade) {
        Grade existingGrade = gradeService.findById(id);
        if (existingGrade != null) {
            // Update the existing grade's properties
            return gradeService.save(grade);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable Long id) {
        gradeService.deleteById(id);
    }
}
