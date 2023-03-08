package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);
    }
}
