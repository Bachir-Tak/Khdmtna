package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.LivraisonCommande;
import com.fstg.gestioncommertiale.dao.CommandeDao;
import com.fstg.gestioncommertiale.dao.LivraisonCommandeDao;
import com.fstg.gestioncommertiale.dao.LivraisonDao;
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
    public int save(String livraisonRef, String commandeRef) {
        // Vérifier si la Livraison existe
        Livraison livraison = livraisonService.findByRef(livraisonRef);
        if (livraison == null) {
            // Retourner immédiatement -1 si la livraison n'existe pas
            return -1;
        }
        // Vérifier si la Commande existe
        Commande commande = commandeService.findByRef(commandeRef);
        if (commande == null) {
            // Retourner immédiatement -1 si la commande n'existe pas
            return -1;
        }
        // Vérifier si une LivraisonCommande existe déjà pour cette Livraison et cette Commande
        LivraisonCommande livraisonCommande = livraisonCommandeDao.findByLivraisonAndCommande(livraison, commande);
        if (livraisonCommande != null) {
            // Retourner immédiatement -1 si une LivraisonCommande existe déjà pour cette Livraison et cette Commande
            return -1;
        }
        // Enregistrer la LivraisonCommande et retourner 1
        livraisonCommande = new LivraisonCommande();
        livraisonCommande.setLivraison(livraison);
        livraisonCommande.setCommande(commande);
        livraisonCommandeDao.save(livraisonCommande);
        return 1;
    }

}



