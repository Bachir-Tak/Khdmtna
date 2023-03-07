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
    private VenteProduitDao venteProduitDao;
    @Autowired
    private FournisseurDao fournisseurDao;

    public Fournisseur findByCode(String code) {
        return fournisseurDao.findByCode(code);
    }

    public List<VenteProduit> findByVenteRef(String ref) {
        return venteProduitDao.findByVenteRef(ref);
    }


    public Vente findByRef(String ref) {
        return venteDao.findByRef(ref);
    }

    public int save(Vente vente, Fournisseur fournisseur, List<VenteProduit> venteProduits) {
        for (VenteProduit venteProduit : venteProduits) {
            if (findByRef(venteProduit.getProduit().getRef()) == null) {
                return -1;
            }else if (findByCode(fournisseur.getCode()) == null) {
                return -2;
            } else {
                venteDao.save(vente);
            }
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
