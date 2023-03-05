package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;
    private Date date;
    @OneToOne
    private Achat achat;
    @OneToMany(mappedBy = "livraison")
    private List<LivraisonCommande> livraisonCommandes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public Long getId() {
        return id;
    }

    public List<LivraisonCommande> getLivraisonCommandes() {
        return livraisonCommandes;
    }

    public void setLivraisonCommandes(List<LivraisonCommande> livraisonCommandes) {
        this.livraisonCommandes = livraisonCommandes;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
