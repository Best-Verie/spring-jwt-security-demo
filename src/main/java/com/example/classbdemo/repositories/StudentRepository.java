package com.example.classbdemo.repositories;

import com.example.classbdemo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.classbdemo.model.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByNames(String names);

    Optional<Student> findByNames(String name);
}
