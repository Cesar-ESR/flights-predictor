package com.flightspredictor.flights.infra.airports.validations;

import com.flightspredictor.flights.infra.airports.dto.AirportData;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ValidateAirpotIataLength {

    public void validate(AirportData data) {
        var iata = data.airportIata();

        if (iata.length() != 3) {
            throw new ValidationException(
                    "Código IATA inválido. El código debe tener 3 dígitos"
            );
        }
    }
}
