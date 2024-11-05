package com.example.API_School.coordinator.entity;

import com.example.API_School.person.Person;
import com.example.API_School.role.RoleType;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter
@Entity
@Table(name = "coordinator")
public class Coordinator extends Person {

    @Column(nullable = false)
    private String course;
    @Enumerated(EnumType.STRING)
    private RoleType role = RoleType.ROLE_COORDINATOR;
}
