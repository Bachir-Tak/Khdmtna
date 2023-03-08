package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.LivraisonCommande;
import com.fstg.gestioncommertiale.dao.LivraisonCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivraisonCommandeService {
    @Autowired
    private LivraisonCommandeDao livraisonCommandeDao;

    public List<LivraisonCommande> findByLivraisonRef(String ref) {
        return livraisonCommandeDao.findByLivraisonRef(ref);
    }

    public int deleteByLivraisonRef(String ref) {
        return livraisonCommandeDao.deleteByLivraisonRef(ref);
    }

    public List<LivraisonCommande> findByCommandeRef(String ref) {
        return livraisonCommandeDao.findByCommandeRef(ref);
    }

    public int deleteByCommandeRef(String ref) {
        return livraisonCommandeDao.deleteByCommandeRef(ref);
    }

    public List<LivraisonCommande> findByLivraisonId(Long id) {
        return livraisonCommandeDao.findByLivraisonId(id);
    }

    public int deleteByLivraisonId(Long id) {
        return livraisonCommandeDao.deleteByLivraisonId(id);
    }

    public List<LivraisonCommande> findByCommandeId(Long id) {
        return livraisonCommandeDao.findByCommandeId(id);
    }

    public int deleteByCommandeId(Long id) {
        return livraisonCommandeDao.deleteByCommandeId(id);
    }
}
