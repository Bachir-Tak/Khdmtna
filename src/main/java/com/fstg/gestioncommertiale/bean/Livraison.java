package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.List;

@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;
    private LocalDateTime date;

    private String ville;
    @OneToOne
    private Achat achat;
    @OneToMany(mappedBy = "livraison")
    private List<LivraisonCommande> livraisonCommandes;



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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
