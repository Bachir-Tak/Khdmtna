package com.fstg.gestioncommertiale.service;

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
        achatService.deleteByCode(code);
        return achatCommandeDao.deleteByAchatCode(code);
    }

    public List<AchatCommande> findByCommandeRef(String ref) {
        return achatCommandeDao.findByCommandeRef(ref);
    }

    @Transactional
    public int deleteByCommandeRef(String ref) {
        commandeService.deleteByRef(ref);
        return achatCommandeDao.deleteByCommandeRef(ref);
    }
    public int  save(AchatCommande achatCommande) {
        achatCommandeDao.save(achatCommande);
        return 1;
    }

  @Autowired
    private AchatCommandeDao achatCommandeDao;
    @Autowired
    private AchatService achatService;

    @Autowired
    private CommandeService commandeService;

}
