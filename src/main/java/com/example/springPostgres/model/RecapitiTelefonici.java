package com.example.springPostgres.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "recapiti_telefonici")
@EntityListeners(AuditingEntityListener.class)
public class RecapitiTelefonici implements Serializable {
    @Id
    private long idreca;

    @Column(name="idana", nullable = false)
    private long idana;

    @Column(name="tipo_recapito", nullable = false)
    private String tipo_recapito;

    @Column(name="numero_recapito", nullable = false)
    private String numero_recapito;

    @ManyToOne()
    @JoinColumn(name = "idana", nullable = false, insertable = false, updatable = false)
    private Anagrafica anagrafica;

    public long getIdreca() {
        return idreca;
    }

    public void setIdreca(long idreca) {
        this.idreca = idreca;
    }

    public long getIdana() {
        return idana;
    }

    public void setIdana(long idana) {
        this.idana = idana;
    }

    public String getTipo_recapito() {
        return tipo_recapito;
    }

    public void setTipo_recapito(String tipo_recapito) {
        this.tipo_recapito = tipo_recapito;
    }

    public String getNumero_recapito() {
        return numero_recapito;
    }

    public void setNumero_recapito(String numero_recapito) {
        this.numero_recapito = numero_recapito;
    }

    public Anagrafica getAnagrafica(){
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }
}
