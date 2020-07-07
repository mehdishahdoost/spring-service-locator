package com.github.servicelocator.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityServiceLocatorConfig {

    @Bean("cityServiceFactory")
    public FactoryBean createServiceLocator() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(CityServiceFactory.class);
        return factoryBean;
    }
}
