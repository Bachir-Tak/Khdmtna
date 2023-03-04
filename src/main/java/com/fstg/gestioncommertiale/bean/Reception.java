package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String libelle;
    @OneToMany(mappedBy = "reception")
    private List<ReceptionProduit> receptionProduit;
    @OneToOne
    private Stock stock;
    private Date dateReception;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<ReceptionProduit> getReceptionProduit() {
        return receptionProduit;
    }

    public void setReceptionProduit(List<ReceptionProduit> receptionProduit) {
        this.receptionProduit = receptionProduit;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }
}
