package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.HistoriqueAchat;
import com.fstg.gestioncommertiale.dao.HistoriqueAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HistoriqueAchatService {

    public HistoriqueAchat findByRef(String ref) {
        return historiqueAchatDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return historiqueAchatDao.deleteByRef(ref);
    }

    public int  save(HistoriqueAchat historiqueAchat) {
        historiqueAchatDao.save(historiqueAchat);
        return 1;
    }

    @Autowired
    private HistoriqueAchatDao historiqueAchatDao;
    
}
