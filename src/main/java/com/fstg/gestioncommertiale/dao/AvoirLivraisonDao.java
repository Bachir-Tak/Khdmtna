package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.AvoirLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvoirLivraisonDao extends JpaRepository<AvoirLivraison, Long> {
    AvoirLivraison findByCode(String code);
    int deleteByCode(String code);
}
