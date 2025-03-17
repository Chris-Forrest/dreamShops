package com.example.dream_shops.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dream_shops.entity.Order;
import com.example.dream_shops.service.OrderService;

import ch.qos.logback.core.model.Model;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    

}
