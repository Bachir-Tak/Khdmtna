package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.bean.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecuRemboursementDao extends JpaRepository<RecuRemboursement,Long> {
    RecuRemboursement findByCode(String code);

    int deleteByCode(String code);

}

