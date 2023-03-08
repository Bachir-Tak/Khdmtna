package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.CompteClient;
import com.fstg.gestioncommertiale.dao.CompteClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompteClientService {

    public CompteClient findByEmail(String email) {
        return compteClientDao.findByEmail(email);
    }
    @Transactional
    public int deleteByEmail(String email) {
        return compteClientDao.deleteByEmail(email);
    }

    public int save(CompteClient compteClient) {
        if (compteClient == null || compteClient.getEmail() == null || compteClient.getEmail().isEmpty() || compteClient.getMotDePasse() == null
                || compteClient.getMotDePasse().isEmpty()) {
            return -1;
        }
        if (compteClient != null) {
                return -2;
            }
        compteClientDao.save(compteClient);
                return 1;
            }


    @Autowired
    private CompteClientDao compteClientDao;
}
