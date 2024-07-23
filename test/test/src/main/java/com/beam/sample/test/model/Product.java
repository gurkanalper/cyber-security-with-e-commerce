package com.beam.sample.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Entity
@Getter
@Setter
@Document(collection = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Eğer id otomatik olarak üretilsin isterseniz
    private String id; // Veya String, UUID vs. kullanabilirsiniz

    private String brand;
    private float price;
    private int quantity;
    private String model;

    public Product() {
        // Default constructor required by JPA
    }

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString(); // UUID oluştur ve id'ye ata
        }
    }

    public Product(String brand, float price, int quantity, String model) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.model = model;
    }
}