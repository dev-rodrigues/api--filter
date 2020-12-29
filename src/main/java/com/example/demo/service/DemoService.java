package com.example.demo.service;

import com.example.demo.domain.entities.Demo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class DemoService {

    public List<Demo> execute() {
        return Arrays.asList(new Demo(UUID.randomUUID(), UUID.randomUUID().toString()));
    }
}
