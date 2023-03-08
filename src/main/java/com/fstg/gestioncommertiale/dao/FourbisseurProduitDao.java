package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FourbisseurProduitDao extends JpaRepository<FournisseurProduit, Long> {
    List<FournisseurProduit> findByProduitRef(String ref);

    int deleteByProduitRef(String ref);



    List<FournisseurProduit> findByFournisseurCode(String code);

    int deleteByFournisseurCode(String code);

   ;
}
