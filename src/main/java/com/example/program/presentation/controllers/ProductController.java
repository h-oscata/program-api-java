package com.example.program.presentation.controllers;

import com.example.program.business.logic.models.Product;
import com.example.program.business.logic.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping
    public ArrayList<Product> getProducts(){
        return this.productService.getProducts();
    }
}
