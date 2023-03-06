package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.CommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {
    @Autowired
    private CommandeDao commandeDao;
}
