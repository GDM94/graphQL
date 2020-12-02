package com.example.springPostgres.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springPostgres.model.Anagrafica;
import com.example.springPostgres.model.Indirizzo;
import com.example.springPostgres.model.RecapitiTelefonici;
import com.example.springPostgres.services.AnagraficaService;
import com.example.springPostgres.services.IndirizzoService;
import com.example.springPostgres.services.RecapitiService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private AnagraficaService anagraficaService;
    private IndirizzoService indirizzoService;
    private RecapitiService recapitiService;

    public Query(AnagraficaService anagraficaService,
                 IndirizzoService indirizzoService,
                 RecapitiService recapitiService){
        this.anagraficaService = anagraficaService;
        this.indirizzoService = indirizzoService;
        this.recapitiService = recapitiService;
    }

    public Optional<Anagrafica> anagraficaByid(long id) {
        return anagraficaService.findById(id);
    }

    public Iterable<Anagrafica> anagraficaAll(){
        return anagraficaService.findAll();
    }

    public Optional<Indirizzo> indirizzoByid(long id){
        return indirizzoService.findById(id);
    }

    public Iterable<Indirizzo> indirizzoAll(){
        return indirizzoService.findAll();
    }

    public Optional<RecapitiTelefonici> recapitoByID(long id){
        return recapitiService.findById(id);
    }

    public Iterable<RecapitiTelefonici> recapitiAll(){
        return recapitiService.findAll();
    }

}
