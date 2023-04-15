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
    private Commande commande;




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
