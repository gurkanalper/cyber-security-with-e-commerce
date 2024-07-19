package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ShoppingCart {

    private int amount;

    private List<Product> products;
    private User user;


    public ShoppingCart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }


    public void removeProduct(Product product) {
        this.products.remove(product);
    }





    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * amount;
        }
        return total;
    }
}
