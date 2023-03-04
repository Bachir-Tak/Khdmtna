package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Achat {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int code;
    @OneToMany(mappedBy = "achat")
    private List<AchatCommande>  achatCommandes;
    @ManyToOne
    private Client client;

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



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public List<AchatCommande> getAchatCommandes() {
        return achatCommandes;
    }

    public void setAchatCommandes(List<AchatCommande> achatCommandes) {
        this.achatCommandes = achatCommandes;
    }
}
