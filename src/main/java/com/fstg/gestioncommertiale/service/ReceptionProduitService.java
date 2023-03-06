package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.ReceptionProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptionProduitService {
    @Autowired
    private ReceptionProduitDao receptionProduitDao;
}
