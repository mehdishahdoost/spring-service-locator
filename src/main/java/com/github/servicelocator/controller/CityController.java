package com.github.servicelocator.controller;

import com.github.servicelocator.model.City;
import com.github.servicelocator.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private RequestService requestService;

    @PostMapping("city")
    public int home(@RequestBody  City city) {
        return requestService.process(city);
    }
}
