package ht.mbds.tp3charles.llm;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface GuideTouristique {

    @SystemMessage("""
            Tu es un guide touristique expert.
            Quand on te donne le nom d'une ville ou d'un pays, indique les {{nb}} principaux endroits à visiter
            ainsi que le prix moyen d'un repas dans la devise du pays.
            N'utilise pas Markdown, réponds uniquement avec du JSON.
            Réponds exactement avec ce format JSON :
            {
              "ville_ou_pays": "nom de la ville ou du pays",
              "endroits_a_visiter": ["endroit 1", "endroit 2"],
              "prix_moyen_repas": "<prix> <devise du pays>"
            }
            """)
    String donnerInfos(@UserMessage String lieu, @V("nb") int nb);
}
