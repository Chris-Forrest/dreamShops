package com.example.dream_shops.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dream_shops.entity.Admin;
import com.example.dream_shops.service.ProductService;

import org.springframework.ui.Model;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/HomePage")
    public String HomePage(){
        return "HomePage";
    }

    @GetMapping("/products")
        public String productPage(Model model){
            model.addAttribute("productList", productService.getAllProduct());

            return "ProductPage";
        }
    

    @GetMapping("/contact")
    public String contactPage(){
        return "ContactPage";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "AboutUs";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("admin", new Admin());
        return "Login";
    }

}
