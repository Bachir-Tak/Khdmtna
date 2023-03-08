package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import com.fstg.gestioncommertiale.bean.Vente;
import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.dao.FournisseurDao;
import com.fstg.gestioncommertiale.dao.VenteDao;
import com.fstg.gestioncommertiale.dao.VenteProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VenteService {
    @Autowired
    private VenteDao venteDao;

    @Autowired
    private FournisseurService fournisseurService;
    @Autowired
    VenteProduitService venteProduitService;


    public Vente findByRef(String ref) {
        return venteDao.findByRef(ref);
    }

    public int save(Vente vente) {
        if (findByRef(vente.getRef()) != null) {
            return -1;
        }
        if (fournisseurService.findByCode( vente.getFournisseur().getCode()) == null) {
            return -2;
        }
        if (vente.getVenteProduits().isEmpty()) {
            return -3;
        }
        venteDao.save(vente);
        for (VenteProduit venteProduit:vente.getVenteProduits()){
            venteProduitService.save(venteProduit);
        }
            return 1;

    }

    @Transactional
    public int deleteByRef(String ref) {
        return venteDao.deleteByRef(ref);
    }

    public List<Vente> findAll() {
        return venteDao.findAll();
    }
}
