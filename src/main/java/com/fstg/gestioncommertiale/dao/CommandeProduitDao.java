package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.AchatCommande;
import com.fstg.gestioncommertiale.bean.CommandeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeProduitDao  extends JpaRepository<CommandeProduit, Long> {
    List<CommandeProduit> findByProduitRef(String ref);
    int deleteByProduitRef(String ref);
    List<CommandeProduit> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<CommandeProduit> findByCommandeRef(String ref);
    int deleteByCommandeRef(String ref);
    List<CommandeProduit> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
}
