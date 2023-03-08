package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.AchatCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchatCommandeDao extends JpaRepository<AchatCommande,Long> {
    List<AchatCommande> findByAchatCode(String code);
    int deleteByAchatCode(String code);

    List<AchatCommande> findByCommandeRef(String ref);
    int deleteByCommandeRef(String ref);

}
