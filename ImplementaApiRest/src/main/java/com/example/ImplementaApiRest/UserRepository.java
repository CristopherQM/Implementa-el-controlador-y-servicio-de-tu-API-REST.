package com.example.integration_project.repository;

import com.example.integration_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries if needed
}