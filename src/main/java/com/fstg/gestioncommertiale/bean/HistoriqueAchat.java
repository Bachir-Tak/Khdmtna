package com.fstg.gestioncommertiale.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class HistoriqueAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;
    @OneToMany(mappedBy = "historiqueAchat")
    private List<Achat> achats;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Achat> getAchats() {
        return achats;
    }

    public void setAchats(List<Achat> achats) {
        this.achats = achats;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
