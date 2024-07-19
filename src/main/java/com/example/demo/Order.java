package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Order {


    private String id;
    private List<Product> products;
    private LocalDateTime orderDate;
    private double totalAmount;
    private String status;
    private User user;
    private String photoURL;





    public Order(String id, List<Product> products, double totalAmount, String status, User user, int amount) {
        this.id = id;
        this.products = products;
        this.orderDate = LocalDateTime.now();
        this.totalAmount = totalAmount;
        this.status = status;
        this.user = user;

    }
    public void updateProductQuantity(Product product, int quantity) {
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                p.setQuantity(quantity);
                return;
            }
        }
    }
}
