package com.beam.sample.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Address")
//@TypeAlias("Address")
@Getter
@Setter
public class Address {

    @Id
    @Column(name = "address_id")
    private String id;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "postal_code")
    private String postalCode;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;


    public Address() {
        // Default constructor required by JPA
    }


    public Address(String street, String city, String state, String postalCode) {
        this.id = UUID.randomUUID().toString();
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private User user;

   // @OneToMany(mappedBy = "address")
   // private List<User> users;

}