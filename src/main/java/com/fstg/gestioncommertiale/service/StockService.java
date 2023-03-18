package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Stock;
import com.fstg.gestioncommertiale.dao.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StockService {
    public List<Stock> findByMagasinCode(String code) {
        return stockDao.findByMagasinCode(code);
    }
    @Transactional

    public int deleteByMagasinCode(String code) {
        return stockDao.deleteByMagasinCode(code);
    }

    public List<Stock> findByProduitRef(String ref) {
        return stockDao.findByProduitRef(ref);
    }
    @Transactional

    public int deleteByProduitRef(String ref) {
        return stockDao.deleteByProduitRef(ref);
    }

    public List<Stock> findAll() {
        return stockDao.findAll();
    }

    public void save (Stock stock){stockDao.save(stock);}
    @Autowired
    private StockDao stockDao;
}
