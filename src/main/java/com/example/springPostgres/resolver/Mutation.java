package com.example.springPostgres.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springPostgres.services.AnagraficaService;
import com.example.springPostgres.services.IndirizzoService;
import com.example.springPostgres.services.RecapitiService;
import org.springframework.stereotype.Component;


@Component
public class Mutation implements GraphQLMutationResolver {

    private AnagraficaService anagraficaService;
    private IndirizzoService indirizzoService;
    private RecapitiService recapitiService;

    public Mutation(AnagraficaService anagraficaService,
                 IndirizzoService indirizzoService,
                 RecapitiService recapitiService){
        this.anagraficaService = anagraficaService;
        this.indirizzoService = indirizzoService;
        this.recapitiService = recapitiService;
    }



}
