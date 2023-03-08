package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.*;
import com.fstg.gestioncommertiale.dao.ReceptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReceptionService {

    public Reception findByRef(String ref) {
        return receptionDao.findByRef(ref);
    }

    @Transactional

    public int deleteByRef(String ref) {
        return receptionDao.deleteByRef(ref);
    }

    public List<Reception> findAll() {
        return receptionDao.findAll();
    }

    public int save(Reception reception, Magasin magasin) {
        if (findByRef(reception.getRef()) != null) {
            return -1;
        }
        for (ReceptionProduit receptionProduit : reception.getReceptionProduit()) {
            if (stockService.findByProduitRef(receptionProduit.getProduit().getRef()).isEmpty()) {
                Stock stock = new Stock();
                stock.setProduit(receptionProduit.getProduit());
                stock.setMagasin(magasin);
                stock.setRef(reception.getRef());
                stock.setQuantite(receptionProduit.getQuantite());
                stock.setQuantiteEntree(receptionProduit.getQuantite());
                stockService.save(stock);
            } else {
                for (Stock stock : stockService.findByProduitRef(receptionProduit.getProduit().getRef())) {
                    if (stock.getMagasin().getCode() == magasin.getCode()) {
                        stock.setQuantite(stock.getQuantite().add(receptionProduit.getQuantite()));
                        stock.setQuantiteEntree(receptionProduit.getQuantite());
                    }
                }
            }
        }
        receptionDao.save(reception);
        return 1;
    }

    @Autowired
    private ReceptionDao receptionDao;

    @Autowired
    private StockService stockService;
}
