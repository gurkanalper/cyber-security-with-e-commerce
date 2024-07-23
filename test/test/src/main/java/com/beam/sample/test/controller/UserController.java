package com.beam.sample.test.controller;

import com.beam.sample.test.model.User;
import com.beam.sample.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestParam String email, @RequestParam String password,
                        @RequestParam String fullName, @RequestParam int phone,
                        @RequestParam String role, @RequestParam String addressId) {
        // Convert the String role to User.Role enum
        User.Role userRole = User.Role.valueOf(role.toUpperCase());
        userService.addUser(email, password, fullName, phone, userRole, addressId);
    }
}
