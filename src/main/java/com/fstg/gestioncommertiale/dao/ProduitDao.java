package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

    Produit findByRef(String ref);

    int deleteByRef(String ref);
}
