package com.fstg.gestioncommertiale.dao;


import com.fstg.gestioncommertiale.bean.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeDao extends JpaRepository<Demande,Long> {
    Demande findByCode(String demande);
    int deleteByCode(String demande);

}
