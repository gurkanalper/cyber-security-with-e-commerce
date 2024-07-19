package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class User {

    public enum Role {
        USER,
        ADMIN
    }


    private String id;
    private String email;
    private String password;
    private List<Address> address;
    private String fullName;
    private int phone;
    private Role role;


    public User(String id, String email, String password, List<Address> address, String fullName, int phone, Role role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.address = address;
        this.fullName = fullName;
        this.phone = phone;
        this.role = role;
    }
}