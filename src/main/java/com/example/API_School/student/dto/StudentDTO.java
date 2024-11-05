package com.example.API_School.student.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {

    private Long id;
    private String name;
    private String course;
    private String birthdate;
}
