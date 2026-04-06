package com.example.first_simple_project.repository;

import com.example.first_simple_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
