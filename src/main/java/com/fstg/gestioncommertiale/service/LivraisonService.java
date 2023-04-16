package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.Paiement;
import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.dao.LivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivraisonService {

    public Livraison findByRef(String ref) {
        return livraisonDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {

        return livraisonDao.deleteByRef(ref);
    }


    public List<Livraison> findAll() {return livraisonDao.findAll();}

    public int save(Livraison livraison) {

            if(findByRef(livraison.getRef()) != null){
                return -1;
            }
            livraisonDao.save(livraison);
            return 1;


    }
    @Autowired
    private LivraisonDao livraisonDao;
    @Autowired
    private PaiementService paiementService;

    @Autowired
    private RecuRemboursementService recuRemboursementService;



}

