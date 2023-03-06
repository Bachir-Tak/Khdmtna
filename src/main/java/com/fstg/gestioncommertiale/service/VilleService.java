package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.VilleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleService {
    @Autowired
    private VilleDao villeDao;
}
