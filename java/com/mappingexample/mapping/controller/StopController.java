package com.mappingexample.mapping.controller;

import com.mappingexample.mapping.entity.Stop;
import com.mappingexample.mapping.repository.StopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stopadd")
public class StopController {

    private StopRepository stopRepository;

    public StopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    // http://localhost:8080/api/v1/stopadd
    @PostMapping
    public ResponseEntity<Stop> addStop(@RequestBody Stop stop){
        Stop savedStop = stopRepository.save(stop);
        return new ResponseEntity<>(savedStop, HttpStatus.CREATED);
    }
}
