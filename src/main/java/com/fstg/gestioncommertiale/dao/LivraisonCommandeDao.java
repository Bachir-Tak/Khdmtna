package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.LivraisonCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivraisonCommandeDao extends JpaRepository<LivraisonCommande, Long> {
    List<LivraisonCommande> findByLivraisonRef(String ref);
    int deleteByLivraisonRef(String ref);
    List<LivraisonCommande> findByCommandeRef(String ref);
    int deleteByCommandeRef(String ref);
    List<LivraisonCommande> findByLivraisonId(Long id);
    int deleteByLivraisonId(Long id);

    List<LivraisonCommande> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);


}
