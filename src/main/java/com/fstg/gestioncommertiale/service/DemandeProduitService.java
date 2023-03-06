package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.DemandeProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemandeProduitService {
    @Autowired
    private DemandeProduitDao demandeProduitDao;
}
