package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVente;
    private int totalVente;
    private Date dateVente;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "venteProduit")
    private List<VenteProduit> venteProduits;

    public Long getIdVente() {
        return idVente;
    }

    public void setIdVente(Long idVente) {
        this.idVente = idVente;
    }

    public int getTotalVente() {
        return totalVente;
    }

    public void setTotalVente(int totalVente) {
        this.totalVente = totalVente;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
