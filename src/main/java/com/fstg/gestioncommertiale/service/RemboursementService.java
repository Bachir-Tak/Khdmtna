package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Remboursement;
import com.fstg.gestioncommertiale.dao.RemboursementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemboursementService {
    public Remboursement findByCode(String code) {
        return remboursementDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return remboursementDao.deleteByCode(code);
    }

    public int  save(Remboursement remboursement) {
        if (findByCode(remboursement.getCode()) != null) {
            return -1;
        } else if (avoirLivraisonService.findByCode(remboursement.getAvoirLivraison().getCode())== null) {
            return -2;
        } else{
            remboursementDao.save(remboursement);
            return 1;
        }
    }
    @Autowired
    private AvoirLivraisonService avoirLivraisonService;
    @Autowired
    private RemboursementDao remboursementDao;

}
