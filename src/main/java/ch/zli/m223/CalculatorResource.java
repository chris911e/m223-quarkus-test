package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator/{number1}/{number2}")
public class CalculatorResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(int number1, int number2) {
        int result = number1 + number2;
        return "result: " + result;
    }
}
