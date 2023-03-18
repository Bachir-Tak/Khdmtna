package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.CategorieProduit;
import com.fstg.gestioncommertiale.dao.CategorieProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CategorieProduitService {
    public CategorieProduit findByCode(String code) {
        return categorieProduitDao.findByCode(code);
    }

    public int save(CategorieProduit categorieProduit) {
        if (findByCode(categorieProduit.getCode()) != null) {
            return -1;
        } else {
            categorieProduitDao.save(categorieProduit);
            return 1;
        }
    }

    @Transactional
    public int deleteByCode(String code) {
        return categorieProduitDao.deleteByCode(code);
    }

    public List<CategorieProduit> findAll() {
        return categorieProduitDao.findAll();
    }

    @Autowired
    private CategorieProduitDao categorieProduitDao;
}
