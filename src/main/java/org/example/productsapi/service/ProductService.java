package org.example.productsapi.service;

import org.example.productsapi.model.Product;
import org.example.productsapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
//take requests from controller to the repository

@Service
public class ProductService {

    public List<Product> findAllProducts(){
        return ProductRepository.products;
    };;



}
