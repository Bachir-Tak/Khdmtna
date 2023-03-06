package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.LivraisonCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivraisonCommandeService {
    @Autowired
    private LivraisonCommandeDao livraisonCommandeDao;
}
