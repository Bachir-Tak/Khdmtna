package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.HistoriqueAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriqueAchatService {
    @Autowired
    private HistoriqueAchatDao historiqueAchatDao;
}
