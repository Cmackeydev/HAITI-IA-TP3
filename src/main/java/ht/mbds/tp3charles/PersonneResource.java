package ht.mbds.tp3charles;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/Personnes/{nom}")
public class PersonneResource {
    @GET
    @Produces("text/plain")
    public String hello(@PathParam("nom") String nom) {return "Hello, " + nom;}
}
