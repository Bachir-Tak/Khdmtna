package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.ModeDePaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeDePaimentService {
    @Autowired
    private ModeDePaiementDao modeDePaiementDao;
}
