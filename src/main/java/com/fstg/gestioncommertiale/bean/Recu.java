package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Recu {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code ;

    private String libelle;
    @OneToOne
    private Paiement paiement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
