package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Compte;
import com.fstg.gestioncommertiale.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompteProvided {
    @Autowired
    private CompteService compteService;

    public Compte findByEmail(String email) {
        return compteService.findByEmail(email);
    }
    @Transactional
    public int deleteByEmail(String email) {
        return compteService.deleteByEmail(email);
    }

    public int save(Compte compte) {
        return compteService.save(compte);
    }
}
