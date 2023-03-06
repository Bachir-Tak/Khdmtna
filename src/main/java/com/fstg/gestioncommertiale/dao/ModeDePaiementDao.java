package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.ModeDePaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeDePaiementDao extends JpaRepository<ModeDePaiement, Long>{
    ModeDePaiement findByCode(String code);

    int deleteByCode(String code);

}
