package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class RecapitulatifAchat {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String code ;
    @OneToMany (mappedBy = "recapitulatifAchat")
    private List<Commande> commandes ;
    private BigDecimal montantTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }
}
