package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CommandeProvided {
    @Autowired
    private CommandeService commandeService;

    public Commande findByRef(String ref) {
        return commandeService.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return commandeService.deleteByRef(ref);
    }

    public int save(Commande commande) {
        return commandeService.save(commande);
    }
}
