package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.RecapitulatifAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecapitulatifAchatDao extends JpaRepository<RecapitulatifAchat, Long> {
    RecapitulatifAchat findByCode(String code);

    int deleteByCode(String code);

    
}
