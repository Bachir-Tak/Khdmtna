package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.ReceptionProduit;
import com.fstg.gestioncommertiale.dao.ReceptionProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ReceptionProduitService {
    public List<ReceptionProduit> findByReceptionRef(String ref) {
        return receptionProduitDao.findByReceptionRef(ref);
    }
    @Transactional
    public int deleteByReceptionRef(String ref) {
        produitService.deleteByRef(ref);
        return receptionProduitDao.deleteByReceptionRef(ref);
    }

    public List<ReceptionProduit> findAll() {
        return receptionProduitDao.findAll();
    }

    public void save (ReceptionProduit receptionProduit){
        receptionProduitDao.save(receptionProduit);
    }
    @Autowired
    private ReceptionProduitDao receptionProduitDao;
    @Autowired
    private ProduitService produitService;
}
