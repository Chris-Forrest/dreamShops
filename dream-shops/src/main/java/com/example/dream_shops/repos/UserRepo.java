package com.example.dream_shops.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dream_shops.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    public User findByEmail(String email);
    
}
