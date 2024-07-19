package com.mappingexample.mapping.controller;

import com.mappingexample.mapping.entity.Bus;
import com.mappingexample.mapping.entity.BusStops;
import com.mappingexample.mapping.entity.Stop;
import com.mappingexample.mapping.repository.BusRepository;
import com.mappingexample.mapping.repository.BusStopsRepository;
import com.mappingexample.mapping.repository.StopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/busstopadd")
public class BusStopController {

    private BusRepository busRepository;

    private StopRepository stopRepository;

    private BusStopsRepository busStopsRepository;

    public BusStopController(BusRepository busRepository, StopRepository stopRepository, BusStopsRepository busStopsRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.busStopsRepository = busStopsRepository;
    }

    // http://localhost:8080/api/v1/busstopadd
    @PostMapping
    public ResponseEntity<BusStops> addBusStop(
            @RequestParam long busid,
            @RequestParam long stopid,
            @RequestBody BusStops busStops
    ){
        Bus bus = busRepository.findById(busid).get();
        Stop stop = stopRepository.findById(stopid).get();
        busStops.setStop(stop);
        busStops.setBus(bus);
        BusStops savedStop = busStopsRepository.save(busStops);
        return new ResponseEntity<>(savedStop, HttpStatus.CREATED);
    }
}
