package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.CommandeProduit;
import com.fstg.gestioncommertiale.dao.CommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class CommandeService {

    public Commande findByRef(String ref) {
        return commandeDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return commandeDao.deleteByRef(ref);
    }

    public int save(Commande commande) {
        LocalDateTime localDateTime = LocalDateTime.now();
        commande.setDate(localDateTime);

        if(findByRef(commande.getRef()) != null){
            return -1;
        }
            if (commande.getCommandeProduits().isEmpty()){
                return -2;
            }

                commandeDao.save(commande);
                for (CommandeProduit commandeProduit : commande.getCommandeProduits()) {
                    System.out.println(commandeProduit.getQuantite());
                    commandeProduitService.save(commande, commande.getCommandeProduits());
                }
                return 1;
            }
           @Autowired
            private CommandeDao commandeDao;
            @Autowired
             private CommandeProduitService commandeProduitService;
        }


