package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Ville;
import com.fstg.gestioncommertiale.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class VilleProvided {
    @Autowired
    private VilleService villeService;


    public Ville findByNom(String nom) {
        return villeService.findByNom(nom);
    }

    @Transactional
    public int deleteByNom(String nom) {
        return villeService.deleteByNom(nom);
    }

    public int save(Ville ville) {
        return villeService.save(ville);
    }
}
