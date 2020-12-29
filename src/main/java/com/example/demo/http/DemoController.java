package com.example.demo.http;

import com.example.demo.domain.entities.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<List<Demo>> get() {
        return ResponseEntity.ok().body(service.execute());
    }

    @GetMapping(value = "/dan")
    public ResponseEntity<List<Demo>> bil() {
        return ResponseEntity.ok().body(service.execute());
    }

}