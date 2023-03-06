package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.PaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaimentService {
    @Autowired
    private PaiementDao paiementDao;
}
