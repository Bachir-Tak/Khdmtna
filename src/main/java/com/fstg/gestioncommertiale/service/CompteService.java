package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Client;
import com.fstg.gestioncommertiale.bean.Compte;
import com.fstg.gestioncommertiale.dao.CompteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompteService {

    public Compte findByEmail(String email) {
        return compteDao.findByEmail(email);
    }

    @Transactional
    public int deleteByEmail(String email) {
        return compteDao.deleteByEmail(email);
    }

    public int save(Compte compte) {
        if (compte.getEmail() == null) {
            return -1;
        } else if (compte.getMotDePasse() == null) {
            return -2;
        } else {
            Client client = compte.getClient();
            clientService.save(client);
            compteDao.save(compte);
            return 1;
        }
    }


    @Autowired
    private CompteDao compteDao;
    @Autowired
    private ClientService clientService;
}

