package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.dao.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    private StockDao stockDao;
}
