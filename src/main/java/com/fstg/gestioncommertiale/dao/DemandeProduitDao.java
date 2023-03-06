package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.DemandeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeProduitDao extends JpaRepository<DemandeProduit,Long> {
    List<DemandeProduit> findByDemandeRef(String ref);

    int deleteByDemandeRef(String ref);
}
