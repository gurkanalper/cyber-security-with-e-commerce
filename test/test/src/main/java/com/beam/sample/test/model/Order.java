package com.beam.sample.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//@Entity
@Getter
@Setter
//@Table(name = "Orders")
@Document(collection = "orders")
public class Order {

    @Id
    //@Column(name = "order_id")
    private String id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<Product> products = new ArrayList<>();
    //@Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;
    //@Column(name = "total_amount", nullable = false)
    private double totalAmount;
   // @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    //@Column(name = "photo_url")
    private String photoURL;

    public Order() {
        // Default constructor required by JPA
    }

    public Order(String id, List<Product> products, double totalAmount, String status, User user) {
        this.id = id;
        this.products = products != null ? products : new ArrayList<>();
        this.orderDate = LocalDateTime.now();
        this.totalAmount = totalAmount;
        this.status = status;
        this.user = user;
    }

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString(); // UUID oluştur ve id'ye ata
        }
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