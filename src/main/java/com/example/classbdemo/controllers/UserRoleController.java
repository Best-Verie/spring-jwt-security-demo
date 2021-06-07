package com.example.classbdemo.controllers;

import com.example.classbdemo.dto.CreateMarkDTO;
import com.example.classbdemo.model.Course;
import com.example.classbdemo.model.Role;
import com.example.classbdemo.model.Student;
import com.example.classbdemo.model.User;
import com.example.classbdemo.repositories.RoleRepository;
import com.example.classbdemo.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class UserRoleController {
    @Autowired
    public RoleRepository roleRepository;

    @GetMapping
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Role role){
        roleRepository.save(role);
        return ResponseEntity.status(HttpStatus.CREATED).body(role);
    }


}
