package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;


@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nom;
    private Long quantite;
    private Long prixVente;
    private Long prixAchat;
    @OneToMany(mappedBy = "produit")
    private List<FournisseurProduit> fournisseurProduits;

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

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Long getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Long prixVente) {
        this.prixVente = prixVente;
    }

    public Long getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Long prixAchat) {
        this.prixAchat = prixAchat;
    }


    public List<FournisseurProduit> getFournisseurProduits() {
        return fournisseurProduits;
    }

    public void setFournisseurProduits(List<FournisseurProduit> fournisseurProduits) {
        this.fournisseurProduits = fournisseurProduits;
    }
}
