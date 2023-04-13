package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.ReceptionProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptionProduitDao extends JpaRepository<ReceptionProduit,Long> {
    List<ReceptionProduit> findByReceptionRef(String ref);

    int deleteByProduitRef(String ref);
    int deleteByReceptionRef(String ref);
}
