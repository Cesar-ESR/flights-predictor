package com.flightspredictor.flights.infra.airports.exceptions;

public class ExternalApiException extends RuntimeException{

    public ExternalApiException (String message) {
        super(message);
    }
}
