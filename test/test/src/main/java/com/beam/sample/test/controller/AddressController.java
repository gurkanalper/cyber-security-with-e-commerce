package com.beam.sample.test.controller;


import com.beam.sample.test.model.Address;
import com.beam.sample.test.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/add")
    public Address addAddress(@RequestParam String street, @RequestParam String city,
                              @RequestParam String state, @RequestParam String postalCode) {
        return addressService.addAddress(street, city, state, postalCode);
    }
}
