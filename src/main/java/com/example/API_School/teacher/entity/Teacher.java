package com.example.API_School.teacher.entity;

import com.example.API_School.person.Person;
import com.example.API_School.role.RoleType;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter
@Entity
@Table(name = "teacher")
public class Teacher extends Person {

    @Column(nullable = false)
    private String course;
    @Enumerated(EnumType.STRING)
    private RoleType role = RoleType.ROLE_TEACHER;
}
