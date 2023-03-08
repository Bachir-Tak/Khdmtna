package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.dao.RecuRemboursementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecuRemboursementService {
    public RecuRemboursement findByCode(String code) {
        return recuRemboursementDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return recuRemboursementDao.deleteByCode(code);
    }

    public int save(RecuRemboursement recuRemboursement) {
        if (findByCode(recuRemboursement.getCode()) != null) {
            return -1;
        } else {
            recuRemboursementDao.save(recuRemboursement);
            return 1;
        }
    }

    @Autowired
    private RecuRemboursementDao recuRemboursementDao;


}
