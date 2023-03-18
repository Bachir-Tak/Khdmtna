package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.ModeDePaiement;
import com.fstg.gestioncommertiale.dao.ModeDePaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ModeDePaiementService {

    public ModeDePaiement findByCode(String code) {
        return modeDePaiementDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return modeDePaiementDao.deleteByCode(code);
    }

    public List<ModeDePaiement> findAll() {
        return modeDePaiementDao.findAll();
    }

    public int save(ModeDePaiement modeDePaiement) {
        if (findByCode(modeDePaiement.getCode())!= null) {
            return -1;
        } else {
           modeDePaiementDao.save(modeDePaiement);
           return 1 ;
        }
    }
    @Autowired
    private ModeDePaiementDao modeDePaiementDao;
}