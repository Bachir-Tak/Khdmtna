package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Demande;
import com.fstg.gestioncommertiale.bean.DemandeProduit;
import com.fstg.gestioncommertiale.bean.Stock;
import com.fstg.gestioncommertiale.dao.DemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DemandeService {
    public Demande findByCode(String code) {
        return demandeDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return demandeDao.deleteByCode(code);
    }

    public int save(Demande demande) {
        if (findByCode(demande.getCode()) != null) {
            return -1;
        }
        for (DemandeProduit demandeProduit : demande.getDemandeProduits()) {
            if (stockService.findByProduitRef(demandeProduit.getProduit().getRef()).isEmpty()) {
                return -2;
            }
            for (Stock stock : stockService.findByProduitRef(demandeProduit.getProduit().getRef())) {
                if (stock.getQuantite().compareTo(demandeProduit.getQuantite()) > 0) {
                    return -3;
                }
            }
        }
        demandeDao.save(demande);
        for (DemandeProduit demandeProduit : demande.getDemandeProduits()){
            demandeProduitService.save(demandeProduit);
        }
        return 1;
    }

    public List<Demande> findAll() {
        return demandeDao.findAll();
    }

    @Autowired
    private DemandeDao demandeDao;

    @Autowired
    private StockService stockService;

    @Autowired
    private DemandeProduitService demandeProduitService;
}
