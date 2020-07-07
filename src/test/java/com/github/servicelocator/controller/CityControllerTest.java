package com.github.servicelocator.controller;

import com.github.servicelocator.model.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CityControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void home() {
        City city = new City();
        city.setName("tokyo");
        ResponseEntity<Integer> integerResponseEntity = restTemplate.postForEntity(
                "http://localhost:" + port + "/city", city, Integer.class);
        Assertions.assertEquals(integerResponseEntity.getBody(), 600);
        Assertions.assertEquals(integerResponseEntity.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void home_newyork() {
        City city = new City();
        city.setName("newyork");
        ResponseEntity<Integer> integerResponseEntity = restTemplate.postForEntity(
                "http://localhost:" + port + "/city", city, Integer.class);
        Assertions.assertEquals(integerResponseEntity.getBody(), 500);
        Assertions.assertEquals(integerResponseEntity.getStatusCode(), HttpStatus.OK);
    }
}
