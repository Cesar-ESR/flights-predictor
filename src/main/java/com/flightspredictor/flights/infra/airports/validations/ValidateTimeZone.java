package com.flightspredictor.flights.infra.airports.validations;

import com.flightspredictor.flights.infra.airports.dto.AirportData;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ValidateTimeZone {

    public void validate (AirportData data) {
        var timeZone = data.timeZone();

        if (timeZone == null || timeZone.isBlank()) {
            throw new ValidationException(
                    "Zona Horaria requerida. Ej: America/Lima"
            );
        }
    }
}
