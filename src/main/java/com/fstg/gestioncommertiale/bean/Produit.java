package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;


@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nom;

    private String ref;

    private Long prixVente;




    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

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
    public Long getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Long prixVente) {
        this.prixVente = prixVente;
    }






}
