package com.mappingexample.mapping.repository;

import com.mappingexample.mapping.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}