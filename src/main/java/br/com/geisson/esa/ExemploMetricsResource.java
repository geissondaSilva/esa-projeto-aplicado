package br.com.geisson.esa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.LinkedList;

@Path("/example")
@Produces("text/plain")
public class ExemploMetricsResource {
    private final LinkedList<Long> list = new LinkedList<>();

    @GET
    @Path("prime/{number}")
    public String checkIfPrime(@PathParam("number") long number) {
        if (number < 1) {
            return "Only natural numbers can be prime numbers.";
        }
        if (number == 1) {
            return number + " is not prime.";
        }
        if (number == 2 || number % 2 == 0) {
            return number + " is not prime.";
        }
        if (testPrimeNumber(number)) {
            return number + " is prime.";
        } else {
            return number + " is not prime.";
        }
    }

    protected boolean testPrimeNumber(long number) {
        for (int i = 3; i < Math.floor(Math.sqrt(number)) + 1; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
