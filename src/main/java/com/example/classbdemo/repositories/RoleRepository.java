package com.example.classbdemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.classbdemo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
