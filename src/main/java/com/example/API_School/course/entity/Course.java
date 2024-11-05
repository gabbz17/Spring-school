package com.example.API_School.course.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String coordinator;
}
