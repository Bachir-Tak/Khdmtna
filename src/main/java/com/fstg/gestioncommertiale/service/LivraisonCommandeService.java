package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.bean.LivraisonCommande;

import com.fstg.gestioncommertiale.dao.LivraisonCommandeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivraisonCommandeService {

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


    public void  save ( LivraisonCommande livraisonCommande) {
        Livraison livraison = livraisonService.findByRef(livraisonCommande.getLivraison().getRef());
    if (livraison == null) {
        livraison = new Livraison();
        livraison.setRef(livraisonCommande.getLivraison().getRef());
        livraisonService.save(livraison);
    }
     Commande commande = commandeService.findByRef(livraisonCommande.getCommande().getRef());
      if (commande == null) {
        commande = new Commande();
        commande.setRef(livraisonCommande.getCommande().getRef());
        commandeService.save(commande);
    }
    livraisonCommande.setLivraison(livraison);
    livraisonCommande.setCommande(commande);
    livraisonCommandeDao.save(livraisonCommande);
}
    @Autowired
    private LivraisonCommandeDao livraisonCommandeDao;
    @Autowired
    private LivraisonService livraisonService;
    @Autowired
    private CommandeService commandeService;
}



