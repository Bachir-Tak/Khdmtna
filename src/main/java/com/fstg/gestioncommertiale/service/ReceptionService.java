package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.ReceptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptionService {
    @Autowired
    private ReceptionDao receptionDao;
}
