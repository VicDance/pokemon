package com.victoria.pokemon.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/cards")
@RegisterRestClient(configKey = "pokemon-tcg-api")
public interface CardClient {

    @GET
    String getAllCards();
}
