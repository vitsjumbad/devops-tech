package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringbootDevopsDemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void greetWithNameReturnsExpectedMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/greet?name=jack", String.class);
        assertThat(response.getBody()).isEqualTo("Hello, jack!");
    }

    @Test
    void greetWithoutNameReturnsExpectedMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/greet", String.class);
        assertThat(response.getBody()).contains("Hello");  // Adjust if you have a default behavior
    }
}
