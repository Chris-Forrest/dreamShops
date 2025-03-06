package com.example.dream_shops.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.dream_shops.entity.Admin;
import com.example.dream_shops.entity.Product;
import com.example.dream_shops.entity.User;
import com.example.dream_shops.service.AdminService;
import com.example.dream_shops.service.OrderService;
import com.example.dream_shops.service.ProductService;
import com.example.dream_shops.service.UserService;


@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping("/verifycredentials")
    public String verifyCredentials(@ModelAttribute("admin") Admin admin, Model model) {
        if(adminService.verifyCredentials(admin.getEmail(), admin.getPassword())) {
            return "redirect:/admin/home";
        }

        model.addAttribute("error", "Invalid email or password");
        return "LoginPage";
    }

    

}
