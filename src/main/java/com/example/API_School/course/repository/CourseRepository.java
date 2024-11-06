package com.example.API_School.course.repository;

import com.example.API_School.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByNameContaining(String name);
}
