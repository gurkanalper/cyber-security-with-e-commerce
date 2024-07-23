package com.beam.sample.test.repository;

import com.beam.sample.test.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByBrand(String brand);
    Product findByPrice(float price);
    Product findByQuantity(int quantity);
    Product findByModel(String model);
}
