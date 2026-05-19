package ht.mbds.tp3charles;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/Personnes/{nom}")
public class PersonneResource {
    @GET
    @Produces("application/json")
    public String[] hello(@PathParam("nom") String nom) {
        return new String[]{nom};
    }
}
