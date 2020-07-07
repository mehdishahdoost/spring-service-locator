package com.github.servicelocator.service.impl;

import com.github.servicelocator.model.City;
import com.github.servicelocator.service.CityService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("tokyo")
public class TokyoService implements CityService {
    @Override
    public int score(City city) {
        return 600;
    }
}
