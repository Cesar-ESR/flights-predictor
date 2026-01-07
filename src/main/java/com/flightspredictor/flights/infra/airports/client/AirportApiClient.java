package com.flightspredictor.flights.infra.airports.client;

import com.flightspredictor.flights.infra.airports.domain.AirportResponse;
import com.flightspredictor.flights.infra.airports.util.AirportUrlBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class AirportApiClient {

    private final WebClient webClient;

    @Value("${api.market.key:}")
    private String apiKey;

    public AirportApiClient(WebClient.Builder webClient) {
        this.webClient = WebClient.builder().build();
    }

    public AirportResponse airportResponse (String iata) {

        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("iata", iata)
                        .build())
                .header("X-API-Key", apiKey)
                .retrieve()
                .bodyToMono(AirportResponse.class)
                .block();
    }
}
