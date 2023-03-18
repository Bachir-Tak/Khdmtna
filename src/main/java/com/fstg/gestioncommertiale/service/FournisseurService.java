package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import com.fstg.gestioncommertiale.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class FournisseurService {

    public Fournisseur findByCode(String code) {
        return fournisseurDao.findByCode(code);
    }

    public int save(Fournisseur fournisseur) {
        if (findByCode(fournisseur.getCode()) != null) {
            return -1;
        } else {
            fournisseurDao.save(fournisseur);
            return 1;
        }
    }

    public List<Fournisseur> findByVilleNom(String nom) {
        return fournisseurDao.findByVilleNom(nom);
    }

    @Transactional
    public int deleteByCode(String code) {
        return fournisseurDao.deleteByCode(code);
    }

    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }

    @Autowired
    private FournisseurDao fournisseurDao;
}
