package com.beam.sample.test.repository;

import com.beam.sample.test.model.Order;
import com.beam.sample.test.model.ProductDesign;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDesignRepository extends MongoRepository<ProductDesign, String> {
    ProductDesign findByQuantity(int quantity);
    ProductDesign findByPrice(int price);
    ProductDesign findByOrder(Order order);
}
