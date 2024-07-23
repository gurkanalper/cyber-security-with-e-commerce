package com.beam.sample.test.repository;

import com.beam.sample.test.model.Product;
import com.beam.sample.test.model.ShoppingCart;
import com.beam.sample.test.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {
    ShoppingCartRepository findByAmount(int amount);
    ShoppingCartRepository findByProducts(List<Product> products);
    ShoppingCartRepository findByUser(User user);
}
