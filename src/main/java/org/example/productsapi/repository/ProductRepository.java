package org.example.productsapi.repository;

import org.example.productsapi.model.Product;

import java.util.Arrays;
import java.util.List;


//interface that interacts with the database
public interface ProductRepository {

    List<Product> products = Arrays.asList(
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
}
