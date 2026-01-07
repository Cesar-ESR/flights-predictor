package com.flightspredictor.flights.infra.airports.validations;

import com.flightspredictor.flights.infra.airports.dto.AirportData;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ValidateAirportIata {

    public void validate (AirportData data) {
        var iata = data.airportIata();

        if (iata == null) {
            throw new ValidationException(
                    "Código IATA requerido."
            );
        }
    }
}
