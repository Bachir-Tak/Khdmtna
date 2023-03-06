package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.CategorieProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieProduitService {
    @Autowired
    private CategorieProduitDao categorieProduitDao;
}
