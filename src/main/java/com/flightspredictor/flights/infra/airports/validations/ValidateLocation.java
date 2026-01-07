package com.flightspredictor.flights.infra.airports.validations;

import com.flightspredictor.flights.infra.airports.dto.AirportData;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ValidateLocation {

    public void validate (AirportData data) {
        var lat = data.latitude();
        var lon = data.longitude();

        if (lat == null || lon == null) {
            throw new ValidationException(
                    "Longitud y Latitud requeridos."
            );
        }
    }
}
