package com.example.springPostgres.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springPostgres.model.Anagrafica;
import com.example.springPostgres.model.Indirizzo;
import com.example.springPostgres.model.RecapitiTelefonici;
import com.example.springPostgres.services.AnagraficaService;
import com.example.springPostgres.services.IndirizzoService;
import com.example.springPostgres.services.RecapitiService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Component;

import java.util.Date;


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

    public Anagrafica newAnagrafica(int id, String nome, String cognome ){
        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setIdana(id);
        anagrafica.setNome(nome);
        anagrafica.setCognome(cognome);
        Date date = new Date();
        anagrafica.setDate_create(date);
        anagrafica.setDate_agg(date);
        anagraficaService.save(anagrafica);
        return anagrafica;
    }

    public Indirizzo newIndirizzo(int id, int idana, String descrizione){
        Indirizzo indirizzo = new Indirizzo();
        indirizzo.setIdAddress(id);
        indirizzo.setIdAna(idana);
        indirizzo.setDescrizione(descrizione);
        Date date = new Date();
        indirizzo.setDate_create(date);
        indirizzo.setDate_agg(date);
        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setIdana(idana);
        indirizzo.setAnagrafica(anagrafica);
        indirizzoService.save(indirizzo);
        return indirizzo;
    }

    public RecapitiTelefonici newRecapito(int id, int idana, String tipo_recapito, String numero_recapito){
        RecapitiTelefonici recapitiTelefonici = new RecapitiTelefonici();
        recapitiTelefonici.setIdreca(id);
        recapitiTelefonici.setIdana(idana);
        recapitiTelefonici.setTipo_recapito(tipo_recapito);
        recapitiTelefonici.setNumero_recapito(numero_recapito);
        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setIdana(idana);
        recapitiTelefonici.setAnagrafica(anagrafica);
        recapitiService.save(recapitiTelefonici);
        return recapitiTelefonici;
    }





}
