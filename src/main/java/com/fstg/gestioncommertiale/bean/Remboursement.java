package com.fstg.gestioncommertiale.bean;


import javax.persistence.*;

@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int code;
    @OneToOne
    private AvoirLivraison avoirLivraison;

    public AvoirLivraison getAvoirLivraison() {
        return avoirLivraison;
    }

    public void setAvoirLivraison(AvoirLivraison avoirLivraison) {
        this.avoirLivraison = avoirLivraison;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
