package com.fstg.gestioncommertiale.dao;

import com.fstg.gestioncommertiale.bean.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDao extends JpaRepository<Stock,Long> {
    List<Stock> findByMagasinCode(String code);

    int deleteByMagasinCode(String code);

    List<Stock> findByProduitRef(String ref);

    int deleteByProduitRef(String ref);
}
