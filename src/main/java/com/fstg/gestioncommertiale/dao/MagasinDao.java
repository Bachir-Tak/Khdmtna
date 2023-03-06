package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagasinDao extends JpaRepository<Magasin,Long> {
    Magasin findByCode(String code);

    int deleteByCode(String code);
}
