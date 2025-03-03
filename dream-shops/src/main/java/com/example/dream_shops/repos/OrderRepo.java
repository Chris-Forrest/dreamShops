package com.example.dream_shops.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dream_shops.entity.Order;
import com.example.dream_shops.entity.User;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

    public List<Order> findByUser(User user);

}
