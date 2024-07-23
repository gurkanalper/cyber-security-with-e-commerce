package com.beam.sample.test.service;

import com.beam.sample.test.model.Address;
import com.beam.sample.test.model.User;
import com.beam.sample.test.repository.AddressRepository;
import com.beam.sample.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public void addUser(String email, String password, String fullName, long phone, User.Role role, String addressId) {
        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new RuntimeException("Address not found"));

        User user = new User(UUID.randomUUID().toString(), email, password, address, fullName, phone, role);
        userRepository.save(user);
    }
}
