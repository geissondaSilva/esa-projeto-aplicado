package br.com.geisson.esa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    public void severe() {
        LOG.log(Level.SEVERE, "Algum erro severo na aplicação");
    }

    @GET
    @Path("/exeception")
    public void excecao() throws Exception {
        throw new Exception("Um erro qualquer");
    }
}