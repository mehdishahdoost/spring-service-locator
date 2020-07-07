package com.github.servicelocator.service;

import com.github.servicelocator.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private CityServiceFactory cityServiceFactory;

    public int process(City city) {
        return this.cityServiceFactory.getCityService(city.getName()).score(city);
    }

}
