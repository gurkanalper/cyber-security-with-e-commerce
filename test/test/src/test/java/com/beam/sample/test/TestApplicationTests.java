package com.beam.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@EnableJpaRepositories(basePackages = "com.beam.sample.test.repository")
@EntityScan(basePackages = "com.beam.sample.test.model")
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

}
