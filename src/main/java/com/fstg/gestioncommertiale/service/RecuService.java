package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Recu;
import com.fstg.gestioncommertiale.dao.RecuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RecuService {
    @Autowired
    private RecuDao recuDao;
    @Autowired
    private PaiementService paiementService;

    public Recu findByCode(String code) {
        return recuDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return recuDao.deleteByCode(code);
    }

    public List<Recu> findAll() {
        return recuDao.findAll();
    }



    public int save(Recu recu) {
        if (recu.getPaiement().isPaiementEffectue()) {
            recuDao.save(recu);
            return 1 ;
        } else {
            return -1;
        }
    }
}



