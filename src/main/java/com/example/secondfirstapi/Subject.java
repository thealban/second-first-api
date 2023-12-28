package com.example.secondfirstapi;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    @ManyToMany(mappedBy = "subjects")
    @JsonBackReference
    private List<Student> students;

    @OneToOne
    @JsonManagedReference
    private Professor professor;
}
