package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String code ;
    @OneToOne
    private Commande commande ;
    private boolean paiementEffectue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    public void setPaiementEffectue(boolean paiementEffectue) {
        this.paiementEffectue = paiementEffectue;
    }
}
