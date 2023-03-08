package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.CommandeProduit;
import com.fstg.gestioncommertiale.dao.CommandeProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommandeProduitService {

    public List<CommandeProduit> findByProduitRef(String ref) {
        return commandeProduitDao.findByProduitRef(ref);
    }
    @Transactional
    public int deleteByProduitRef(String ref) {
        return commandeProduitDao.deleteByProduitRef(ref);
    }

    public List<CommandeProduit> findByCommandeRef(String ref) {
        return commandeProduitDao.findByCommandeRef(ref);
    }
    @Transactional
    public int deleteByCommandeRef(String ref) {
        return commandeProduitDao.deleteByCommandeRef(ref);
    }

    public void save(Commande commande, List<CommandeProduit> commandeProduits) {
        for (CommandeProduit commandeProduit : commandeProduits) {
            commandeProduit.setPrixTotale(commandeProduit.getPrixUnitaire().multiply(commandeProduit.getQuantite()));
            commandeProduit.setCommande(commande);
            commandeProduit.setCommande(commande);
            if(commandeProduit.getProduit() != null && commandeProduit.getProduit().getRef()!=null){
                commandeProduit.setProduit(produitService.findByRef(commandeProduit.getProduit().getRef()));
            }
            commandeProduitDao.save(commandeProduit);
        }
    }
    @Autowired
    private CommandeProduitDao commandeProduitDao;
    @Autowired
    private ProduitService produitService;
}
