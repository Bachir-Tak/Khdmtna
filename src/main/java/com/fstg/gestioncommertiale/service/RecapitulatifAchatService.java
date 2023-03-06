package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.RecapitulatifAchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecapitulatifAchatService {
    @Autowired
    private RecapitulatifAchatDao recapitulatifAchatDao;
}
