package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.AvoirLivraison;
import com.fstg.gestioncommertiale.dao.AvoirLivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvoirLivraisonService {
    @Autowired
    private AvoirLivraisonDao avoirLivraisonDao;

    public AvoirLivraison findByCode(String code) {
        return avoirLivraisonDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return avoirLivraisonDao.deleteByCode(code);
    }
    public boolean save(AvoirLivraison avoirLivraison) {
        AvoirLivraison existingAvoirLivraison = avoirLivraisonDao.findByCode(avoirLivraison.getCode());
        if (existingAvoirLivraison != null) {
            return false;
        } else {
            avoirLivraisonDao.save(avoirLivraison);
            return true;
        }
    }
}
