package com.example.demo;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Product {



    private String id;
    private String brand;
    private float price;
    private int quantity;
    private String model;



    public Product(String id, String brand, float price, int quantity, String model) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.model = model;
    }

}
