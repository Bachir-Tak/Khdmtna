package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.VenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenteService {
    @Autowired
    private VenteDao venteDao;
}
