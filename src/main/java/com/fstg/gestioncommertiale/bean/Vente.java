package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private BigDecimal totalVente;
    private Date dateVente;
    @ManyToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "vente")
    private List<VenteProduit> venteProduits;

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalVente() {
        return totalVente;
    }

    public void setTotalVente(BigDecimal totalVente) {
        this.totalVente = totalVente;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<VenteProduit> getVenteProduits() {
        return venteProduits;
    }

    public void setVenteProduits(List<VenteProduit> venteProduits) {
        this.venteProduits = venteProduits;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
