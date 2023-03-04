package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;

@Entity
public class AvoirLivraison {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int code;
    @OneToOne
    private Livraison livraison;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Livraison getLivraison() {
        return livraison;
    }

    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
