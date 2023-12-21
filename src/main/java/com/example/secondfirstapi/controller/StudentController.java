package com.example.secondfirstapi.controller;

import com.example.secondfirstapi.Student;
import com.example.secondfirstapi.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Student> findAll() {
        return repository.findAll();
    }
}
