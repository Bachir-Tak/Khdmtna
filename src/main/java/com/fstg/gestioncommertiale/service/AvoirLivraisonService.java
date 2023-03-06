package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.AvoirLivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvoirLivraisonService {
    @Autowired
    private AvoirLivraisonDao avoirLivraisonDao;
}
