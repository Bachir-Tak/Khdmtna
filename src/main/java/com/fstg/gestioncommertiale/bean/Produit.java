package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;


@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idProduit;
    private String nomProduit;
    private Long quantiteProduit;
    private Long prixProduitVente;
    private Long prixProduitAchat;
    @OneToMany(mappedBy = "produit")
    private List<CategorieProduit> categorieProduits;
    @ManyToOne
    private Commande commande;

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public List<CategorieProduit> getCategorieProduit() {
        return categorieProduits;
    }

    public void setCategorieProduit(List<CategorieProduit> categorieProduit) {
        this.categorieProduits = categorieProduit;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Long getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(Long quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public Long getPrixProduitVente() {
        return prixProduitVente;
    }

    public void setPrixProduitVente(Long prixProduit) {
        this.prixProduitVente = prixProduit;
    }

    public Long getPrixProduitAchat() {
        return prixProduitAchat;
    }

    public void setPrixProduitAchat(Long prixProduitAchat) {
        this.prixProduitAchat = prixProduitAchat;
    }

    public List<CategorieProduit> getCategorieProduits() {
        return categorieProduits;
    }

    public void setCategorieProduits(List<CategorieProduit> categorieProduits) {
        this.categorieProduits = categorieProduits;
    }
}
