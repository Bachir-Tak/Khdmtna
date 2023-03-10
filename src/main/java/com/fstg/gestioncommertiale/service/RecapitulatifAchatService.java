package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.RecapitulatifAchat;
import com.fstg.gestioncommertiale.dao.RecapitulatifAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RecapitulatifAchatService {

    public RecapitulatifAchat findByCode(String code) {
        return recapitulatifAchatDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return recapitulatifAchatDao.deleteByCode(code);
    }

    public List<RecapitulatifAchat> findAll() {
        return recapitulatifAchatDao.findAll();
    }

    public int save(RecapitulatifAchat recapitulatifAchat) {
        if (findByCode(recapitulatifAchat.getCode())!= null) {
            return -1;
        } else {
             recapitulatifAchatDao.save(recapitulatifAchat);
             return 1;
        }
    }
    @Autowired
    private RecapitulatifAchatDao recapitulatifAchatDao;
}
