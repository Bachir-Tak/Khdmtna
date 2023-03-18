package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import com.fstg.gestioncommertiale.dao.FourbisseurProduitDao;
import com.fstg.gestioncommertiale.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class FournisseurProduitService {

    public int  save(FournisseurProduit fournisseurProduit){
        if (fournisseurService.findByCode(fournisseurProduit.getFournisseur().getCode())!=null) {
            return -1;
        }else {
            fournisseurProduitDao.save(fournisseurProduit);
            return 1;
        }
    }

    public List<FournisseurProduit> findByProduitRef(String ref) {
        return fournisseurProduitDao.findByProduitRef(ref);
    }
    @Transactional
    public int deleteByProduitRef(String ref) {
        return fournisseurProduitDao.deleteByProduitRef(ref);
    }

    public List<FournisseurProduit> findByFournisseurCode(String code) {
        return fournisseurProduitDao.findByFournisseurCode(code);
    }
    @Transactional
    public int deleteByFournisseurCode(String code) {
        return fournisseurProduitDao.deleteByFournisseurCode(code);
    }

    public List<FournisseurProduit> findAll() {
        return fournisseurProduitDao.findAll();
    }

    @Autowired
    private FourbisseurProduitDao fournisseurProduitDao;
    @Autowired
    private  FournisseurService fournisseurService;



}
