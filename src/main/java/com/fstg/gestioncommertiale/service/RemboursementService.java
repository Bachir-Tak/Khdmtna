package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.RemboursementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemboursementService {
    @Autowired
    private RemboursementDao remboursementDao;
}
