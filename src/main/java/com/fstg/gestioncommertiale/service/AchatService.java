package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.AchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchatService {
    @Autowired
    private AchatDao achatDao;
}
