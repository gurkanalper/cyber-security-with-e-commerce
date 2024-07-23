package com.beam.sample.test.repository;

import com.beam.sample.test.model.Address;
import com.beam.sample.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    User findByPassword(String password);
    User findByAddress(List<Address> address);
    User findByFullName(String fullName);
    User findByPhone(int phone);
    User findByRole(User.Role role);
}
