package com.beam.sample.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.UUID;

@Entity
@TypeAlias("User")
@Getter
@Setter
//@Document(collection = "users")
@Table(name = "Users")
public class User {

    public enum Role {
        USER,
        ADMIN
    }


    @Id
    @Column(name = "user_id")
    private String id;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone")
    private long phone;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;


    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private List<Address> address;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public User() {
        // Default constructor required by JPA
    }



    public User(String id, String email, String password, Address address, String fullName, long phone, Role role) {
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

