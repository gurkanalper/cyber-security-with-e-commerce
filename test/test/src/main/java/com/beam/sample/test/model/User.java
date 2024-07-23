package com.beam.sample.test.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;
import java.util.UUID;

@Entity
@TypeAlias("User")
@Getter
@Setter
//@Document(collection = "users")
public class User {

    public enum Role {
        USER,
        ADMIN
    }


    @Id
    private String id;

    private String email;
    private String password;

    private String fullName;
    private int phone;
    private Role role;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> address;

    public User(String id, String email, String password, List<Address> address, String fullName, int phone, Role role) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
        this.address = address;
        this.fullName = fullName;
        this.phone = phone;
        this.role = role;
    }

    //String sql= "INSERT INTO case.Users(user_id, password, email, full_name, phone, address_id)"+
    //"VALUES ('12345', '55555', 'ayse.kaya@gmail.com', 'Ayşe Kaya', 05056743323, '5') ";



}

