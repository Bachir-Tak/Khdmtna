package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.CompteClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteClientService {
    @Autowired
    private CompteClientDao compteClientDao;
}
