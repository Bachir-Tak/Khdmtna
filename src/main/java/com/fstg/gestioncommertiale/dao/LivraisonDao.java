package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonDao extends JpaRepository<Livraison, Long> {
    Livraison findByRef(String ref);
    int deleteByRef(String ref);
}
