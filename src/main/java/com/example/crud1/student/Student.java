package com.example.crud1.student;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder


public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int course;
}
