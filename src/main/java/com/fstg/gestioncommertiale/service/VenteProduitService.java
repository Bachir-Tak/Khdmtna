package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.dao.ProduitDao;
import com.fstg.gestioncommertiale.dao.VenteProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VenteProduitService {
    @Autowired
    private VenteProduitDao venteProduitDao;
    @Autowired
    private ProduitDao produitDao;

    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);
    }

    public int save(VenteProduit venteProduit, Produit produit) {
        if (findByProduitRef(produit.getRef()) != null) {
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
        return venteProduitDao.deleteByProduitRef(ref);
    }

    public List<VenteProduit> findByProduitId(Long id) {
        return venteProduitDao.findByProduitId(id);
    }

    @Transactional
    public int deleteByProduitId(Long id) {
        return venteProduitDao.deleteByProduitId(id);
    }

    public List<VenteProduit> findByVenteRef(String ref) {
        return venteProduitDao.findByVenteRef(ref);
    }

    @Transactional
    public int deleteByVenteRef(String ref) {
        return venteProduitDao.deleteByVenteRef(ref);
    }

    public List<VenteProduit> findByVenteId(Long id) {
        return venteProduitDao.findByVenteId(id);
    }

    @Transactional
    public int deleteByVenteId(Long id) {
        return venteProduitDao.deleteByVenteId(id);
    }
}
