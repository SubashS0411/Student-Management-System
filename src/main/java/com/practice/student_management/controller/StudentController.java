package com.practice.student_management.controller;

import com.practice.student_management.model.Student;
import com.practice.student_management.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping
    public Student save(@Valid @RequestBody Student student) {
        return studentService.save(student);
    }
    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id){
        return studentService.findById(id);
    }
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id,@Valid @RequestBody Student student) {
        return studentService.update(id, student);
    }
    @DeleteMapping("/{id}")

    public  String delete(@PathVariable Long id){
        studentService.deteteById(id);
        return "Student id is deleted Successfully";
    }
}
