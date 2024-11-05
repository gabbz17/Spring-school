package com.example.API_School.student.service;

import com.example.API_School.student.entity.Student;
import com.example.API_School.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public final StudentRepository repository;
    public StudentService(StudentRepository repository) {this.repository = repository;}
    private final PasswordEncoder passwordEncoder;


    public Student create(Student student){
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        return repository.save(student);
    }

    public List<Student> findAll(){
        return repository.findAll();
    }
}
