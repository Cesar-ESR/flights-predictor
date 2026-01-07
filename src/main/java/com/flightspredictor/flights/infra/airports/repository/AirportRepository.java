package com.flightspredictor.flights.infra.airports.repository;

import com.flightspredictor.flights.infra.airports.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirportRepository extends JpaRepository<Airport, Long> {
    Optional<Airport> findByAirportIata(String iata);
}
