package com.example.springPostgres.resolver;


import com.example.springPostgres.model.Anagrafica;
import com.example.springPostgres.model.Indirizzo;
import com.example.springPostgres.model.RecapitiTelefonici;
import com.example.springPostgres.services.AnagraficaService;
import org.springframework.stereotype.Component;

@Component
public class IndirizziResolver {
    private AnagraficaService anagraficaService;

    public  IndirizziResolver (AnagraficaService anagraficaService){
        this.anagraficaService = anagraficaService;
    }

    public Anagrafica getAnagrafica(Indirizzo indirizzo){
        return anagraficaService.findById(indirizzo.getAnagrafica().getIdana()).orElse(null);
    }
}
