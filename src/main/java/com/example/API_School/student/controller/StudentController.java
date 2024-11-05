package com.example.API_School.student.controller;

import com.example.API_School.student.dto.StudentDTO;
import com.example.API_School.student.dto.mapper.StudentMapper;
import com.example.API_School.student.entity.Student;
import com.example.API_School.student.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    public final StudentService service;
    public StudentController(StudentService service) {this.service = service;}


    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student st = service.create(student);
        return ResponseEntity.status(201).body(st);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        List<Student> list = service.findAll();
        List<StudentDTO> list1 = StudentMapper.toAllDTO(list);
        return ResponseEntity.ok().body(list1);
    }
}
