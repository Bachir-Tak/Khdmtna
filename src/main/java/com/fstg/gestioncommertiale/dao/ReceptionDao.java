package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionDao extends JpaRepository<Reception,Long> {
    Reception findByRef(String ref);

    int deleteByRef(String ref);
}
