package br.com.geisson.esa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/log")
public class ExemploResource {

    private static final Logger LOG = Logger.getLogger(ExemploResource.class.getName());

    @GET
    @Path("/info")
    public void info() {
        LOG.info("Entrou no log");
    }

    @GET
    @Path("/severe")
    public void erro() {
        LOG.log(Level.SEVERE, "Algum erro severo na aplicação");
    }
}