package com.example.springPostgres.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.springPostgres.model.Anagrafica;
import com.example.springPostgres.model.RecapitiTelefonici;
import com.example.springPostgres.services.AnagraficaService;
import org.springframework.stereotype.Component;

@Component
public class RecapitiResolver implements GraphQLResolver<RecapitiTelefonici> {
     private AnagraficaService anagraficaService;

     public  RecapitiResolver(AnagraficaService anagraficaService){
         this.anagraficaService = anagraficaService;
     }

     public Anagrafica getAnagrafica(RecapitiTelefonici recapitiTelefonici){
          return anagraficaService.findById(recapitiTelefonici.getAnagrafica().getIdana()).orElse(null);
     }
}
