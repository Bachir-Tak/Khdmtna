package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemboursementDao extends JpaRepository<Remboursement, Long> {

    Remboursement findByCode(String code);

    int deleteByCode(String code);



}

