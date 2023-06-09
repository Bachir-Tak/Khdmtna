package com.fstg.gestioncommertiale.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String libelle;

    private String code;
    @OneToOne
    private Client client;
    @OneToMany(mappedBy = "demande")
    @JsonManagedReference(value = "demande-demandeProduit")
    private List<DemandeProduit> demandeProduits;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public List<DemandeProduit> getDemandeProduits() {
        return demandeProduits;
    }

    public void setDemandeProduits(List<DemandeProduit> demandeProduits) {
        this.demandeProduits = demandeProduits;
    }
}
