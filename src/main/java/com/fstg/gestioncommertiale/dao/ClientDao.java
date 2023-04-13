package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByCin(String cin);
    int deleteByCin(String cin);



}
