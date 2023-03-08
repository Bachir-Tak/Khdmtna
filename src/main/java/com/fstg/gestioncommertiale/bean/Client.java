package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    private String prenom;

    private String cin;
    @OneToOne
    private CompteClient compteClient;
    @ManyToOne
    private Ville ville;

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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public CompteClient getCompteClient() {
        return compteClient;
    }

    public void setCompteClient(CompteClient compteClient) {
        this.compteClient = compteClient;
    }
}
