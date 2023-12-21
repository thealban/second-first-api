package com.example.secondfirstapi.repository;

import com.example.secondfirstapi.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT st FROM Student st JOIN FETCH st.subjects su JOIN FETCH su.professor pr")
    List<Student> findAllStudents();
}
