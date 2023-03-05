package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Achat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchatDao  extends JpaRepository<Achat, Long> {
    Achat findByCode(String code);
    int deleteByCode(String code);
}
