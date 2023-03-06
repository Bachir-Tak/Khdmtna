package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;
}
