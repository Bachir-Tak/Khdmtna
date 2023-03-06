package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
    Fournisseur findByCode(String code);

    int deleteByCode(String code);
}
