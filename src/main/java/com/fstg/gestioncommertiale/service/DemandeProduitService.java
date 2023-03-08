package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.DemandeProduit;
import com.fstg.gestioncommertiale.dao.DemandeProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DemandeProduitService {

    public List<DemandeProduit> findByDemandeRef(String ref) {
        return demandeProduitDao.findByDemandeRef(ref);
    }
    @Transactional
    public int deleteByDemandeRef(String ref) {
        return demandeProduitDao.deleteByDemandeRef(ref);
    }

    public List<DemandeProduit> findAll() {
        return demandeProduitDao.findAll();
    }

    public void save (DemandeProduit demandeProduit){
        demandeProduitDao.save(demandeProduit);
    }
    @Autowired
    private DemandeProduitDao demandeProduitDao;
}
