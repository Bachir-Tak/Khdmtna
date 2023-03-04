package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Recu {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int code ;
    @OneToOne
    private Paiement paiement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
}
