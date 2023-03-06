package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.HistoriqueAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriqueAchatDao extends JpaRepository<HistoriqueAchat, Long> {
    HistoriqueAchat findByRef(String ref);
    int deleteByRef(String ref);
}
