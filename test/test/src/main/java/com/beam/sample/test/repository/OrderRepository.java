package com.beam.sample.test.repository;


import com.beam.sample.test.model.Order;
import com.beam.sample.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findByStatus(String status);
    Order findByPhotoURL(String photoURL);
    Order findByTotalAmount(double totalAmount);
    Order findByProducts(List<Product> products);
    Order findByOrderDate(LocalDateTime orderDate);
}


