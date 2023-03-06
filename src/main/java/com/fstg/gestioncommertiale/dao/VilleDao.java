package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {
    Ville  findByNom(String nom);

    int deleteByNom(String nom);
}
