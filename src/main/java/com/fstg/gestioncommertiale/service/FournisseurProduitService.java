package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.FourbisseurProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurProduitService {
    @Autowired
    private FourbisseurProduitDao fourbisseurProduitDao;
}
