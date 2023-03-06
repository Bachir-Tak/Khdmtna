package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.CompteClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteClientDao extends JpaRepository<CompteClient, Long> {
    CompteClient  findByEmail(String email);
    int deleteByEmail(String email);

}
