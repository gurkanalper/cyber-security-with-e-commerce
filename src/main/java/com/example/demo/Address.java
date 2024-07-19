package com.example.demo;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Address {


    private String street;
    private String city;
    private String state;
    private String postalCode;


    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.postalCode = zipCode;
    }

}
