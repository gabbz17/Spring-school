package com.example.API_School.student.entity;

import com.example.API_School.person.Person;
import com.example.API_School.role.RoleType;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter
@Entity
@Table(name = "student")
public class Student extends Person {

    @Column(nullable = false)
    private String address;
    @Enumerated(EnumType.STRING)
    private RoleType role = RoleType.ROLE_STUDENT;
}
