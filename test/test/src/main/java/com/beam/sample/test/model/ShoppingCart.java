package com.beam.sample.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
//@Table(name = "ShoppingCart")
@Document(collection = "shopping_cart")
public class ShoppingCart {

    @Id
   // @Column(name = "cart_id")
    private String id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cart_id")
    private List<Product> products = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
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