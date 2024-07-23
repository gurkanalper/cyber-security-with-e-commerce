package com.beam.sample.test.repository;

import com.beam.sample.test.model.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ShoppingCartRepositoryTest {
    @Autowired
    private ShoppingCartRepository shoppingcartRepository;

    @Test
    public void testList() {
        List<ShoppingCart> all = shoppingcartRepository.findAll();
    }
}
