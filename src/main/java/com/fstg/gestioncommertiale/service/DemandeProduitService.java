package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.DemandeProduit;
import com.fstg.gestioncommertiale.dao.DemandeProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DemandeProduitService {

    public List<DemandeProduit> findAll() {
        return demandeProduitDao.findAll();
    }

    public void save (DemandeProduit demandeProduit){
        demandeProduitDao.save(demandeProduit);
    }


    public List<DemandeProduit> findByDemandeCode(String code) {
        return demandeProduitDao.findByDemandeCode(code);
    }
    @Transactional
    public int deleteByDemandeCode(String code) {
        demandeService.deleteByCode(code);
        return demandeProduitDao.deleteByDemandeCode(code);
    }
    @Autowired
    private DemandeProduitDao demandeProduitDao;

    @Autowired
    private DemandeService demandeService;
}
