package com.beam.sample.test.repository;

import com.beam.sample.test.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
    Address findByCity(String city);
    Address findByState(String state);
    Address findByPostalCode(String postalCode);
    Address findByStreet(String street);



}
