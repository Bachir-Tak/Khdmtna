package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.CommandeProduit;
import com.fstg.gestioncommertiale.service.CommandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CommandeProduitProvided {
    @Autowired
    private CommandeProduitService commandeProduitService;

    public List<CommandeProduit> findByProduitRef(String ref) {
        return commandeProduitService.findByProduitRef(ref);
    }

    @Transactional
    public int deleteByProduitRef(String ref) {
        return commandeProduitService.deleteByProduitRef(ref);
    }

    public List<CommandeProduit> findByCommandeRef(String ref) {
        return commandeProduitService.findByCommandeRef(ref);
    }

    @Transactional
    public int deleteByCommandeRef(String ref) {
        return commandeProduitService.deleteByCommandeRef(ref);
    }

    public void save(Commande commande, List<CommandeProduit> commandeProduits) {
        commandeProduitService.save(commande, commandeProduits);
    }
}
