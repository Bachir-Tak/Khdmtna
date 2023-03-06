package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {
    Paiement findByCode(String code);

    int deleteByCode(String code);
}
