package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private int code ;
    @OneToOne
    private Achat achat ;


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

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }
}
