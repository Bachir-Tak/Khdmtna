package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Achat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @OneToMany(mappedBy = "achat")
    private List<AchatCommande> achatCommandes;
    @ManyToOne
    private Compte compte;



    public HistoriqueAchat getHistoriqueAchat() {
        return historiqueAchat;
    }

    public void setHistoriqueAchat(HistoriqueAchat historiqueAchat) {
        this.historiqueAchat = historiqueAchat;
    }

    @ManyToOne
    private HistoriqueAchat historiqueAchat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }







    public List<AchatCommande> getAchatCommandes() {
        return achatCommandes;
    }

    public void setAchatCommandes(List<AchatCommande> achatCommandes) {
        this.achatCommandes = achatCommandes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
