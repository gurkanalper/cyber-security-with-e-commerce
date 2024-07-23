package com.beam.sample.test.model;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "productDesigns")
public class ProductDesign {


    @Id
    private String id;
    private int quantity;
    private int price;
    private Order order;


    public ProductDesign( String id, int caseQuantity, int price){
        this.id=id;
        this.quantity=quantity;
        this.price=price;

    }
}

