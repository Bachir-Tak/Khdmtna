package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idCategorieProduit;
    private int stock;
    @ManyToOne
    private Produit produit;

    public Long getIdCategorieProduit() {
        return idCategorieProduit;
    }

    public void setIdCategorieProduit(Long idCategorieProduit) {
        this.idCategorieProduit = idCategorieProduit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
