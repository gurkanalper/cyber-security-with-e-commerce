package com.beam.sample.test.repository;

import com.beam.sample.test.model.Address;
import com.beam.sample.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    User findByPassword(String password);
    User findByAddress(Address address);
    User findByFullName(String fullName);
    User findByPhone(long phone);
    User findByRole(User.Role role);


}
