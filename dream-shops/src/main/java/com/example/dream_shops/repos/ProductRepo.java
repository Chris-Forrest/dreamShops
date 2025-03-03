package com.example.dream_shops.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dream_shops.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    public Product findByName(String name);

}
