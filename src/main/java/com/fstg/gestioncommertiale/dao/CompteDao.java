package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteDao extends JpaRepository<Compte, Long> {
    Compte findByEmail(String email);
    int deleteByEmail(String email);

}
