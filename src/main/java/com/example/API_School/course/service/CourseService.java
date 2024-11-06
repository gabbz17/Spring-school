package com.example.API_School.course.service;

import com.example.API_School.course.entity.Course;
import com.example.API_School.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    public final CourseRepository repository;
    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course create(Course course){
        return repository.save(course);
    }

    public Course findByName(String name){
        return repository.findByNameContaining(name);
    }

    public List<Course> findAll(){
        return repository.findAll();
    }
}
