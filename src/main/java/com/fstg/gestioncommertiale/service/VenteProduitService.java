package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.dao.VenteProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenteProduitService {
    @Autowired
    private VenteProduitDao venteProduitDao;
}
