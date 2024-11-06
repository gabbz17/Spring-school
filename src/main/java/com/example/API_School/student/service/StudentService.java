package com.example.API_School.student.service;

import com.example.API_School.course.entity.Course;
import com.example.API_School.course.service.CourseService;
import com.example.API_School.student.entity.Student;
import com.example.API_School.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public final StudentRepository repository;
    private CourseService service;
    public StudentService(StudentRepository repository, CourseService service) {this.repository = repository;
        this.service = service;
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Student create(Student student){
        Course cr = service.findByName(student.getCourse());
        if (cr == null){
            throw new RuntimeException("Este curso não existe!");
        }
        return repository.save(student);
    }

    public List<Student> findAll(){
        return repository.findAll();
    }
}
