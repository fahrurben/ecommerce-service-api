package com.fahrurben.ecommerceserviceapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrurben.ecommerceserviceapi.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
