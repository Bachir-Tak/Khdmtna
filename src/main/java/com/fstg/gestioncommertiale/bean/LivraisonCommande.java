package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity

public class LivraisonCommande {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Livraison livraison;
    @OneToOne
    private Commande commande;

    public Livraison getLivraison() {
        return livraison;
    }

    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
