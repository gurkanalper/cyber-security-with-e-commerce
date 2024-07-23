package com.beam.sample.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.UUID;


@Entity
@TypeAlias("Address")
@Getter
@Setter
public class Address {

    @Id
    private String id;

    private String street;
    private String city;
    private String state;
    private String postalCode;


    public Address(String street, String city, String state, String postalCode) {
        this.id = UUID.randomUUID().toString();
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}