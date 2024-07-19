package com.example.demo;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductDesign {


    private String id;
    private int quantity;
    private int price;
    private Order order;
    private String phUrl;

    public ProductDesign( String id, int caseQuantity, int price){
        this.id=id;
        this.quantity=quantity;
        this.price=price;

    }
}
