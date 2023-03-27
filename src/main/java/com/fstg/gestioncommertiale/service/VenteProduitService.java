package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.dao.ProduitDao;
import com.fstg.gestioncommertiale.dao.VenteProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class VenteProduitService {
    @Autowired
    private VenteProduitDao venteProduitDao;
    @Autowired
    private ProduitService produitService;

    @Autowired
    private VenteService venteService;



    public int save(VenteProduit venteProduit) {
        if (produitService.findByRef(venteProduit.getProduit().getRef())!=null) {
            return -1;
        } else {
            venteProduitDao.save(venteProduit);
            return 1;
        }
    }

    public List<VenteProduit> findByProduitRef(String ref) {
        return venteProduitDao.findByProduitRef(ref);
    }

    @Transactional
    public int deleteByProduitRef(String ref) {
        produitService.deleteByRef(ref);
        return venteProduitDao.deleteByProduitRef(ref);
    }



    public List<VenteProduit> findByVenteRef(String ref) {
        return venteProduitDao.findByVenteRef(ref);
    }

    @Transactional
    public int deleteByVenteRef(String ref) {
        venteService.deleteByRef(ref);
        return venteProduitDao.deleteByVenteRef(ref);
    }

    public List<VenteProduit> findAll() {
        return venteProduitDao.findAll();
    }
}
