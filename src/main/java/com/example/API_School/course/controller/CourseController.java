package com.example.API_School.course.controller;

import com.example.API_School.course.entity.Course;
import com.example.API_School.course.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {

    public final CourseService service;
    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course){
        Course cs = service.create(course);
        return ResponseEntity.status(201).body(cs);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Course> findByName(@PathVariable String name){
        Course course = service.findByName(name);
        return ResponseEntity.ok().body(course);
    }

    @GetMapping
    public ResponseEntity<List<Course>> findAll(){
        List<Course> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
