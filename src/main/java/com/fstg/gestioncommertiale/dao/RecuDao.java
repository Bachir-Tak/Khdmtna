package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Recu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RecuDao extends JpaRepository<Recu, Long> {
    Recu findByCode(String code);

    int deleteByCode(String code);
}
