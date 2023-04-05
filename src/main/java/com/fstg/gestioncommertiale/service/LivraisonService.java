package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.Paiement;
import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.dao.LivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LivraisonService {

    public Livraison findByRef(String ref) {
        return livraisonDao.findByRef(ref);
    }

    @Transactional

    public void deleteByRef(String ref){
        Livraison livraison = livraisonDao.findByRef(ref);
        RecuRemboursement recuRemboursement = recuRemboursementService.findByCode(livraison.getAchat().getCode());
        if (recuRemboursement !=null && recuRemboursement.getRemboursement() !=null){
            livraisonDao.deleteByRef(ref);
        }
    }

    public int save(Livraison livraison) {
        Paiement paiement = paiementService.findByCode(livraison.getAchat().getCode());
        if (paiement != null && paiement.isPaiementEffectue()) {
            livraisonDao.save(livraison);
            livraison.setVille(livraison.getVille());
            return 1;
        } else {
            return -1;
        }
    }
    @Autowired
    private LivraisonDao livraisonDao;
    @Autowired
    private PaiementService paiementService;

    @Autowired
    private RecuRemboursementService recuRemboursementService;


}

