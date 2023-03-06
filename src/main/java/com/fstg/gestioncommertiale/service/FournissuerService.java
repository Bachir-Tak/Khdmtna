package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournissuerService {
    @Autowired
    private FournisseurDao fournisseurDao;
}
