package com.beam.sample.test.repository;

import com.beam.sample.test.model.ProductDesign;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductDesignRepositoryTest {
    @Autowired
    private ProductDesignRepository productdesignRepository;

    @Test
    public void testList() {
        List<ProductDesign> all = productdesignRepository.findAll();
    }
}
