package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.LivraisonCommande;
;
import com.fstg.gestioncommertiale.dao.LivraisonCommandeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
public class LivraisonCommandeService {
    @Autowired
    private LivraisonCommandeDao livraisonCommandeDao;
    @Autowired
    private LivraisonService livraisonService;
    @Autowired
    private CommandeService commandeService;

    public List<LivraisonCommande> findByLivraisonRef(String ref) {
        return livraisonCommandeDao.findByLivraisonRef(ref);
    }
    @Transactional
    public int deleteByLivraisonRef(String ref) {
        return livraisonCommandeDao.deleteByLivraisonRef(ref);
    }

    public List<LivraisonCommande> findByCommandeRef(String ref) {
        return livraisonCommandeDao.findByCommandeRef(ref);
    }
    @Transactional
    public int deleteByCommandeRef(String ref) {
        return livraisonCommandeDao.deleteByCommandeRef(ref);
    }
    public int save( LivraisonCommande livraisonCommande) {
        // Vérifier si la Commande existe
        Commande commande = commandeService.findByRef( livraisonCommande.getCommande().getRef());
        if (commande != null) {
            // Retourner immédiatement -1 si la commande n'existe pas
            return -1;
        }
        // Vérifier si la Livraison existe
        Livraison livraison = livraisonService.findByRef( livraisonCommande.getLivraison().getRef());
        if (livraison != null) {
            // Retourner immédiatement -2 si la livraison n'existe pas
            return -2;
        }
        // Vérifier si une LivraisonCommande existe déjà pour cette Livraison et cette Commande
         if (livraisonCommandeDao.findByLivraisonAndCommande(livraison, commande) != null) {
            // Retourner immédiatement -1 si une LivraisonCommande existe déjà pour cette Livraison et cette Commande
            return -3;
        } else {
            // Enregistrer la LivraisonCommande et retourner 1
            livraisonCommande = new LivraisonCommande();
            livraisonCommande.setLivraison(livraison);
            livraisonCommande.setCommande(commande);
            livraisonCommandeDao.save(livraisonCommande);
            return 1;
        }
    }

}



