package com.example.secondfirstapi;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Komninimi
     */
    private String firsN;

    /**
     *
     * Hello world
     */
    private String lastName;

    /**
     * Subjects bla bla bla
     */
    @ManyToMany
    @JoinTable(
            name = "student_subject_rel",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    @JsonManagedReference
    private List<Subject> subjects;
}
