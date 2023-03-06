package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteDao extends JpaRepository<Vente, Long> {
    Vente findByRef(String ref);

    int deleteByRef(String ref);
}
