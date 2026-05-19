package ht.mbds.tp3charles;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/Personnes/{nom}")
public class PersonneResource {
    @GET
    @Produces("text/plain")
    public Response hello(@PathParam("nom") String nom) {return Response.ok("Hello, " + nom).build();}
}
