package com.mappingexample.mapping.repository;

import com.mappingexample.mapping.entity.BusStops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStopsRepository extends JpaRepository<BusStops, Long> {
}