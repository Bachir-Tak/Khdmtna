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


    public LivraisonCommande save(String livraisonRef, String commandeRef) {
    //Verifier si la Livraison existe
    Livraison livraison = livraisonService.findByRef(livraisonRef);
    if (livraison == null) {
        //Creer une nouvelle Livraison si elle n'existe pas
        livraison = new Livraison();
        livraison.setRef(livraisonRef);
        livraisonService.save(livraison);
    }

    //Verifier si la Commande existe
    Commande commande = commandeService.findByRef(commandeRef);
    if (commande == null) {
        //Creer une nouvelle Commande si elle n'existe pas
        commande = new Commande();
        commande.setRef(commandeRef);
        commandeService.save(commande);
    }

    //Creer une ordre pour la livraison
    LivraisonCommande livraisonCommande = new LivraisonCommande();
    livraisonCommande.setLivraison(livraison);
    livraisonCommande.setCommande(commande);

    return livraisonCommandeDao.save(livraisonCommande);
}
}



