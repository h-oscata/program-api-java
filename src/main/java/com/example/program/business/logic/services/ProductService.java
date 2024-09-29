package com.example.program.business.logic.services;

import com.example.program.business.logic.models.Product;
import com.example.program.dataaccess.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>) productRepository.findAll();
    }
}
