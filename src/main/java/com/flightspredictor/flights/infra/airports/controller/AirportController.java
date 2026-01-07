package com.flightspredictor.flights.infra.airports.controller;

import com.flightspredictor.flights.infra.airports.entity.Airport;
import com.flightspredictor.flights.infra.airports.service.AirportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/airports")
@RestController
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/{iata}")
    public ResponseEntity<Airport> getAirport (@PathVariable String iata) {
        Airport airport = airportService.getAirport(iata);

        return ResponseEntity.ok(airport);
    }
}
