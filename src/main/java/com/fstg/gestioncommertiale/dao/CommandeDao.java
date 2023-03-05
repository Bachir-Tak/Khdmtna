package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
    Commande findByRef(String ref);

    int deleteByRef(String ref);
}
