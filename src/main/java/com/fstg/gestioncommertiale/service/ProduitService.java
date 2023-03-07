package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);
    }

    public int save(Produit produit) {
        if (findByRef(produit.getRef()) != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return -1;
        }
    }

    public int update(Produit produit, Long prixAchat, Long prixVente) {
        if (findByRef(produit.getRef()) != null) {
            produit.setPrixAchat(prixAchat);
            produit.setPrixVente(prixVente);
            return 1;
        } else {
            return -2;
        }


    }

    @Transactional
    public int deleteByRef(String ref) {
        return produitDao.deleteByRef(ref);
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }
}
