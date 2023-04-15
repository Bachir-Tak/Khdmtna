package com.fstg.gestioncommertiale.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CommandeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private BigDecimal prixTotale;
    @ManyToOne
    @JoinColumn(name = "commande")
    @JsonBackReference(value = "commande-commandeProduit")
    private Commande commande;
    @ManyToOne
    @JoinColumn(name = "produit")
    private Produit produit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }


    public BigDecimal getPrixTotale() {
        return prixTotale;
    }

    public void setPrixTotale(BigDecimal prixTotale) {
        this.prixTotale = prixTotale;
    }



    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }
}
