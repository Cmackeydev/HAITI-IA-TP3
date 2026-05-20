package ht.mbds.tp3charles;

import ht.mbds.tp3charles.llm.LlmClientPourGemini;
import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.StringReader;

@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    private LlmClientPourGemini llmClient;

    @GET
    @Path("/lieu/{lieu}/{nb}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject endroitsDeVisite(@PathParam("lieu") String lieu, @PathParam("nb") int nb) {
        String reponseJson = llmClient.chat(lieu, nb);
        return Json.createReader(new StringReader(reponseJson)).readObject();
    }
}
