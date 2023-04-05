package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String nom;

    private String adresse;

    private String ville;

    @OneToMany (mappedBy = "fournisseur")
    private List<FournisseurProduit> fournisseurProduits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public List<FournisseurProduit> getFournisseurProduits() {
        return fournisseurProduits;
    }

    public void setFournisseurProduits(List<FournisseurProduit> fournisseurProduits) {
        this.fournisseurProduits = fournisseurProduits;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
