package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.MagasinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagasinService {
    @Autowired
    private MagasinDao magasinDao;
}
