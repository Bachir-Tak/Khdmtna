package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.RecuRemboursementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecuRemboursementService {
    @Autowired
    private RecuRemboursementDao recuRemboursementDao;
}
