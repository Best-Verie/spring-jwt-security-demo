package com.example.classbdemo.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.classbdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String usernameOrMobileOrEmail);

	Optional<User> findByEmailOrUsernameOrMobile(String login, String login2, String login3);

	boolean existsByEmail(String email);

	boolean existsByMobile(String mobile);

}
