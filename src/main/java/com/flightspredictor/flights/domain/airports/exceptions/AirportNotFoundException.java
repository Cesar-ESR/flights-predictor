package com.flightspredictor.flights.domain.airports.exceptions;

public class AirportNotFoundException extends RuntimeException {

    public AirportNotFoundException(String iata) {
        super("Aeropuerto no encontrado por el IATA: " + iata);
    }
}
