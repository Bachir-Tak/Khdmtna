package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Livraison {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    @OneToOne
    private Achat achat;

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
}
