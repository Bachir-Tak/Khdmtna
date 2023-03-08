package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.HistoriqueAchat;
import com.fstg.gestioncommertiale.dao.HistoriqueAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HistoriqueAchatService {
    @Autowired
    private HistoriqueAchatDao historiqueAchatDao;

    public HistoriqueAchat findByRef(String ref) {
        return historiqueAchatDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return historiqueAchatDao.deleteByRef(ref);
    }
}
