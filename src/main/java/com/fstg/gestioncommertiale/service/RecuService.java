package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.RecuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecuService {
    @Autowired
    private RecuDao recuDao;
}
