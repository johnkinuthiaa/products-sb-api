package org.example.productsapi.controller;


import org.example.productsapi.model.Product;
import org.example.productsapi.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//this class handles requests from the client
@RestController
@RequestMapping("/api/v1/products")

public class Controller {
    private final ProductService service;

    public Controller(ProductService service){
        this.service=service;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return service.findAllProducts();
    }
}
