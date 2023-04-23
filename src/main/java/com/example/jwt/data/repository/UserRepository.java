package com.example.jwt.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.data.model.User;


public interface UserRepository extends JpaRepository<Integer , User> {
    
}
