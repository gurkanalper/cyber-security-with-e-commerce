package com.beam.sample.test.repository;

import com.beam.sample.test.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testList(){
        List<User> all = userRepository.findAll();
    }



}
