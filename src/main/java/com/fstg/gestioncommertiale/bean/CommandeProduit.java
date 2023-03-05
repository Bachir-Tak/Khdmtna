package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CommandeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal quantite;

    private BigDecimal prixTotale;
    @ManyToOne
    private Commande commande;
    @ManyToOne
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

    public BigDecimal getQuantiteCommande() {
        return quantite;
    }

    public void setQuantiteCommande(BigDecimal quantiteCommande) {
        this.quantite = quantiteCommande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
