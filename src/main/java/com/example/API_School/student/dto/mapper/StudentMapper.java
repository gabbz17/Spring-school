package com.example.API_School.student.dto.mapper;

import com.example.API_School.student.dto.StudentDTO;
import com.example.API_School.student.entity.Student;

import java.util.List;

public class StudentMapper {

    public static StudentDTO toDTO(Student student){
        return new StudentDTO(student.getId(), student.getName(), student.getCourse(), student.getBirthdate());
    }

    public static List<StudentDTO> toAllDTO(List<Student> cl){
        return cl.stream().map(StudentMapper::toDTO).toList();
    }
}
