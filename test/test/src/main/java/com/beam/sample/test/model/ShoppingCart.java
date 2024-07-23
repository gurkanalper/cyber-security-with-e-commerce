package com.beam.sample.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class ShoppingCart {

    @Id
    private String id;

    @OneToMany
    private List<Product> products = new ArrayList<>();

    @ManyToOne
    private User user;

    private int amount;

    public ShoppingCart() {
        // Default constructor
    }

    public ShoppingCart(String id, User user) {
        this.id = id;
        this.user = user;
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