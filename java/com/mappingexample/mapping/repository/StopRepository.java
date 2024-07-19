package com.mappingexample.mapping.repository;

import com.mappingexample.mapping.entity.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<Stop, Long> {
}