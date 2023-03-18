package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Magasin;
import com.fstg.gestioncommertiale.dao.MagasinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class MagasinService {
    public Magasin findByCode(String code) {
        return magasinDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return magasinDao.deleteByCode(code);
    }

    public List<Magasin> findAll() {
        return magasinDao.findAll();
    }

    public int save(Magasin magasin) {
        if (findByCode(magasin.getCode()) != null) {
            return -1;
        }
        magasinDao.save(magasin);
        return 1;
    }


    @Autowired
    private MagasinDao magasinDao;
}
