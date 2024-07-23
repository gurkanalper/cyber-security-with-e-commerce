package com.beam.sample.test.service;

import com.beam.sample.test.model.Address;
import com.beam.sample.test.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    // Method to add a new address
    public Address addAddress(String street, String city, String state, String postalCode) {
        Address address1 = new Address("Murat", "Ankara", "Baglıca", "06790");
        return addressRepository.save(address1);
    }
}