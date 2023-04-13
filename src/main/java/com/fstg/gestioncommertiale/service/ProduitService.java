package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.bean.ReceptionProduit;
import com.fstg.gestioncommertiale.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProduitService {


    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);

    }

    public int save(Produit produit) {
        if (findByRef(produit.getRef()) != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return 1;
        }
    }

    public int update(Produit produit, Long prixVente) {
        if (findByRef(produit.getRef()) == null) {
            return -1;
        } else {
            produit.setPrixVente(prixVente);
            produitDao.save(produit);
            return 1;
        }
    }
    @Transactional
    public int deleteByRef(String ref) {
        receptionProduitService.deleteByProduitRef(ref);
        stockService.deleteByProduitRef(ref);
        return produitDao.deleteByRef(ref);
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    @Autowired
    private ProduitDao produitDao;

    @Autowired
    private StockService stockService;

    @Autowired
    private ReceptionProduitService receptionProduitService;
}
