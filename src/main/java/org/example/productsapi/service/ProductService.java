package org.example.productsapi.service;

import jakarta.annotation.PostConstruct;
import org.example.productsapi.model.Product;
import org.example.productsapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
//take requests from controller to the repository

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    private final List<Product> products = Arrays.asList(
            new Product(1L,
                    "samsung",
                    100,
                    "some samsung phones",
                    100D
            ),
            new Product(2L,
                    "iphone",
                    100,
                    "some classy iphones",
                    150D
            ),
            new Product(3L,
                    "oppo",
                    100,
                    "some oppo phones",
                    50D
            )
    );
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
    @PostConstruct
    public List<Product> saveProducts() {
        return productRepository.saveAll(products);
    }
}
