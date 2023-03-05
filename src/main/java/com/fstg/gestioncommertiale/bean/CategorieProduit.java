package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String code;
    @OneToMany (mappedBy = "categorieProduit")
    private List<Produit> produits;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
