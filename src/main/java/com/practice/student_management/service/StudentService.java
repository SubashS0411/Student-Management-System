package com.practice.student_management.service;

import com.practice.student_management.model.Student;
import com.practice.student_management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    public Student findById(long id) {
        return  studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student is not found"));
    }
    public Student update(long id,Student student) {
        Student existingStudent=findById(id);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        return studentRepository.save(existingStudent);
    }
public void deteteById(long id){
    studentRepository.deleteById(id);
}
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
