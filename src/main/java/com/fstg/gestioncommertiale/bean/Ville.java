package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Ville {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
     @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
