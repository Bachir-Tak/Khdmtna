package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.bean.AchatCommande;
import com.fstg.gestioncommertiale.dao.AchatCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AchatCommandeService {

    public List<AchatCommande> findByAchatCode(String code) {
        return achatCommandeDao.findByAchatCode(code);
    }

    @Transactional
    public int deleteByAchatCode(String code) {
        return achatCommandeDao.deleteByAchatCode(code);
    }

    public List<AchatCommande> findByCommandeRef(String ref) {
        return achatCommandeDao.findByCommandeRef(ref);
    }

    @Transactional
    public int deleteByCommandeRef(String ref) {
        return achatCommandeDao.deleteByCommandeRef(ref);
    }
    public void save(Achat achat, List<AchatCommande> achatCommandes) {

    }

    @Autowired
    private AchatCommandeDao achatCommandeDao;

}
