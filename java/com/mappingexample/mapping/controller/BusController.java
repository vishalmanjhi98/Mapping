package com.mappingexample.mapping.controller;

import com.mappingexample.mapping.entity.Bus;
import com.mappingexample.mapping.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/busadd")
public class BusController {
    @Autowired
    private BusRepository busRepository;

    // http://localhost:8080/api/v1/busadd
    @PostMapping
    public ResponseEntity<Bus> addBus(@RequestBody Bus bus){
        Bus savedBus = busRepository.save(bus);
        return new ResponseEntity<>(savedBus, HttpStatus.CREATED);
    }
}
