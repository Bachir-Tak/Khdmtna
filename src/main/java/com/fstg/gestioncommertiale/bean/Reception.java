package com.fstg.gestioncommertiale.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;

    private String libelle;
    @OneToMany(mappedBy = "reception")
    @JsonManagedReference(value = "reception-receptionProduit")
    private List<ReceptionProduit> receptionProduit;
    @OneToOne
    private Magasin magasin;
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

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
