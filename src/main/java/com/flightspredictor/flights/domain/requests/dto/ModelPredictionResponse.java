package com.flightspredictor.flights.domain.requests.dto;

public record ModelPredictionResponse(
        String prevision,
        Double probabilidad
) {}
