package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class FournisseurProduit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFournisseurProduit;
    @ManyToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "produit")
    private List<Produit> produits;

    public Long getIdFournisseurProduit() {
        return idFournisseurProduit;
    }

    public void setIdFournisseurProduit(Long idFournisseurProduit) {
        this.idFournisseurProduit = idFournisseurProduit;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
