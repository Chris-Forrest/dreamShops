package com.example.dream_shops.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dream_shops.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

    public Admin findByEmail(String email);

}
