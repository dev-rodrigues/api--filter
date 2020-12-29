package com.example.demo.domain.filter.config;

import com.example.demo.domain.filter.AcceleratorFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistrationConfiguration {

    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(new AcceleratorFilter());

        // adicionar para urls especificas
        registration.addUrlPatterns("/demo/teste");

        return  registration;
    }

}
