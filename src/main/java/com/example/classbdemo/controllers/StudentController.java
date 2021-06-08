package com.example.classbdemo.controllers;

import com.example.classbdemo.model.Student;
import com.example.classbdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){

        if(studentRepository.existsByNames(student.getNames())) {
            return ResponseEntity.status(HttpStatus.CREATED).body(studentRepository.findByNames(student.getNames()).get());
        }
        studentRepository.save(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

}
