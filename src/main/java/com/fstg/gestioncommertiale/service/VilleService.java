package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Ville;
import com.fstg.gestioncommertiale.dao.VilleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VilleService {

    public Ville findByNom(String nom) {
        return villeDao.findByNom(nom);
    }
    @Transactional
    public int deleteByNom(String nom) {
        return villeDao.deleteByNom(nom);
    }

    public int save(Ville ville) {
        if (findByNom(ville.getNom()) != null) {
            return -1;
        }
        villeDao.save(ville);
            return 1;

    }
    @Autowired
    private VilleDao villeDao;
}


