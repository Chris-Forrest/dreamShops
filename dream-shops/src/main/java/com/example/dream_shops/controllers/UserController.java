package com.example.dream_shops.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dream_shops.entity.User;
import com.example.dream_shops.service.UserService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;


@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/add/user")
    public  String addUser(){
        return "AddUser";
    }

    @PostMapping("/add/user")
    public String addUser(User user){
        userService.createUser(user);

        return "Login";
    }

    @GetMapping("/update/user/{id}")
    public String updateUser(@PathVariable Long id, Model model){
        model.addAttribute("admin", userService.getUserById(id));

        return "UpdateUser";
    }

    @PostMapping("/update/user")
    public String updateUser(User user){
        userService.createUser(user);

        return "/admin/home";
    }

    @DeleteMapping("/delete/user/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);

        return "redirect:/admin/home";
    }

    
}
