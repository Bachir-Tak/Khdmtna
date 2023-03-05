package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class VenteProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVentProduit;
    @ManyToOne
    private Vente vente;
    public Long getIdVentProduit() {
        return idVentProduit;
    }

    public void setIdVentProduit(Long idVentProduit) {
        this.idVentProduit = idVentProduit;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }


}
