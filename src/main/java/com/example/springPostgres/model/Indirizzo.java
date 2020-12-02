package com.example.springPostgres.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "Indirizzo")
@EntityListeners(AuditingEntityListener.class)
public class Indirizzo implements Serializable {
    @Id
    private int idaddress;

    @Column(name="idana", nullable = false)
    private int idana;

    @Column(name="descrizione", nullable = false)
    private String descrizione;

    @Column(name = "date_create", nullable = false)
    private java.util.Date date_create;

    @Column(name = "date_agg", nullable = false)
    private java.util.Date date_agg;

    @ManyToOne()
    @JoinColumn(name = "idana", nullable = false, insertable = false, updatable = false)
    private Anagrafica anagrafica;

    public int getIdAddress() {
        return idaddress;
    }

    public void setIdAddress(int id) {
        this.idaddress = id;
    }

    public int getIdAna() {
        return idana;
    }

    public void setIdAna(int id) {
        this.idana = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public Date getDate_agg() {
        return date_agg;
    }

    public void setDate_agg(Date data_agg) {
        this.date_agg = data_agg;
    }

    public Anagrafica getAnagrafica(){
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {this.anagrafica = anagrafica; }

}