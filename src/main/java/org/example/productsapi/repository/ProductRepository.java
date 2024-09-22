package org.example.productsapi.repository;

import org.example.productsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


//interface that interacts with the database
public interface ProductRepository extends JpaRepository<Product, Long> {

}



















