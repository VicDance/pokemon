package com.victoria.pokemon.api;

import com.victoria.pokemon.model.CardResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/cards")
@RegisterRestClient(configKey = "pokemon-tcg-api")
public interface CardClient {

    @GET
    List<CardResponse> getAllCards();

    @GET
    @Path("/{id}")
    CardResponse getCardById(@PathParam("id") String id);
}
