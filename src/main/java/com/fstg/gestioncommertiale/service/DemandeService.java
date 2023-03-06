package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.DemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemandeService {
    @Autowired
    private DemandeDao demandeDao;
}
