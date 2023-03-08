package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.LivraisonCommande;
import com.fstg.gestioncommertiale.bean.Paiement;
import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.dao.LivraisonDao;
import com.fstg.gestioncommertiale.dao.PaiementDao;
import com.fstg.gestioncommertiale.dao.RecuRemboursementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivraisonService {
    @Autowired
    private LivraisonDao livraisonDao;

    public Livraison findByRef(String ref) {
        return livraisonDao.findByRef(ref);
    }
    @Autowired
    private RecuRemboursementDao recuRemboursementDao;
    public void delete(String ref){
        Livraison livraison = livraisonDao.findByRef(ref);
        RecuRemboursement recuRemboursement = recuRemboursementDao.findByCode(livraison.getAchat().getCode());
        if (recuRemboursement !=null && recuRemboursement.getRemboursement() !=null){
            livraisonDao.deleteByRef(ref);
        }
    }
    @Autowired
    private PaiementDao paiementDao;
    public int save(LivraisonCommande livraisonCommande) {
        Livraison livraison = livraisonDao.findByRef();
        Paiement paiement = paiementService.getPaiementByCode(livraison.getAchat().getCode());

        if (paiement != null && paiement.isPaiementEffectue()) {
            livraisonDao.save(livraison);
            return 1;
        } else {
            return -1;
        }
    }
}

