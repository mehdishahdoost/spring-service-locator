package com.github.servicelocator.service.impl;

import com.github.servicelocator.model.City;
import com.github.servicelocator.service.CityService;
import org.springframework.stereotype.Component;

@Component("newyork")
public class NewyorkService implements CityService {

    @Override
    public int score(City city) {
        return 500;
    }
}
