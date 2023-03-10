package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.VenteProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VenteProduitDao extends JpaRepository<VenteProduit, Long> {
    List<VenteProduit> findByProduitRef(String ref);

    int deleteByProduitRef(String ref);




    List<VenteProduit> findByVenteRef(String ref);

    int deleteByVenteRef(String ref);



}
