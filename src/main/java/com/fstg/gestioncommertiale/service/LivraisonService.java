package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.LivraisonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivraisonService {
    @Autowired
    private LivraisonDao livraisonDao;
}
