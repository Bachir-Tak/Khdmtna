package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientDao clientDao;
}
