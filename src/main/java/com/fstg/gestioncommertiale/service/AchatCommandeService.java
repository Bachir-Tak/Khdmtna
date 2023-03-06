package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.AchatCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchatCommandeService {
    @Autowired
    private AchatCommandeDao achatCommandeDao;
}
