package com.fstg.gestioncommertiale.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;
    @ManyToOne
    @JoinColumn(name = "magasin")
    @JsonBackReference(value = "magasin-stock")

    private Magasin magasin ;
    @ManyToOne
    @JoinColumn(name = "produit")
    private Produit produit;

    private BigDecimal quantite;

    private BigDecimal quantiteDefectueuse;

    private BigDecimal quantiteEntree;

    private BigDecimal quantiteSortie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }


    public BigDecimal getQuantiteDefectueuse() {
        return quantiteDefectueuse;
    }

    public void setQuantiteDefectueuse(BigDecimal quantiteDefectueuse) {
        this.quantiteDefectueuse = quantiteDefectueuse;
    }

    public BigDecimal getQuantiteEntree() {
        return quantiteEntree;
    }

    public void setQuantiteEntree(BigDecimal quantiteEntree) {
        this.quantiteEntree = quantiteEntree;
    }

    public BigDecimal getQuantiteSortie() {
        return quantiteSortie;
    }

    public void setQuantiteSortie(BigDecimal quantiteSortie) {
        this.quantiteSortie = quantiteSortie;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }
}
