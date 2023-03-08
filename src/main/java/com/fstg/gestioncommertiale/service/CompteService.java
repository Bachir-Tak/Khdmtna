package com.fstg.gestioncommertiale.service;

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
        if (compte == null || compte.getEmail() == null || compte.getEmail().isEmpty() || compte.getMotDePasse() == null
                || compte.getMotDePasse().isEmpty()) {
            return -1;
        }
        if (compte != null) {
                return -2;
            }
        compteDao.save(compte);
                return 1;
            }


    @Autowired
    private CompteDao compteDao;
}
