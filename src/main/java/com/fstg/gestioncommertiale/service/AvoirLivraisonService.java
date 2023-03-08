package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.AvoirLivraison;
import com.fstg.gestioncommertiale.dao.AvoirLivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AvoirLivraisonService {
    @Autowired
    private AvoirLivraisonDao avoirLivraisonDao;

    public AvoirLivraison findByCode(String code) {
        return avoirLivraisonDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return avoirLivraisonDao.deleteByCode(code);
    }
    public int save(AvoirLivraison avoirLivraison) {
        AvoirLivraison existingAvoirLivraison = avoirLivraisonDao.findByCode(avoirLivraison.getCode());
        if (existingAvoirLivraison != null) {
            return -1;
        }
            avoirLivraisonDao.save(avoirLivraison);
            return 1;

    }
}
