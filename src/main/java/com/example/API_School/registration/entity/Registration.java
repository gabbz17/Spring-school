package com.example.API_School.registration.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String student;
    @Column(nullable = false)
    private String course;
}
