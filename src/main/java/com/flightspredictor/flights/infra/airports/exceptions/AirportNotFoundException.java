package com.flightspredictor.flights.infra.airports.exceptions;

public class AirportNotFoundException extends RuntimeException {

    public AirportNotFoundException(String iata) {
        super("Aeropuerto no encontrado por el IATA: " + iata);
    }
}
