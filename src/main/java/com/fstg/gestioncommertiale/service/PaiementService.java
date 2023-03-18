package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Paiement;
import com.fstg.gestioncommertiale.dao.PaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

   @Service
    public class PaiementService {

    public Paiement findByCode(String code) {
        return paiementDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return paiementDao.deleteByCode(code);
    }

    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }

    public int save(Paiement paiement) {
        if (findByCode(paiement.getCode())!= null){
            return -1 ;
        }else {
            paiementDao.save(paiement);
            return 1 ;
        }
    }
       @Autowired
       private PaiementDao paiementDao;
}
