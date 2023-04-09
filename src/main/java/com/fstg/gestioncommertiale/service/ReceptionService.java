package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.*;
import com.fstg.gestioncommertiale.dao.ReceptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

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

    public int save(Reception reception) {
        boolean test = false;
        if (findByRef(reception.getRef()) != null) {
            return -1;
        }
        for (ReceptionProduit receptionProduit : reception.getReceptionProduit()) {
            test = false;
            for (Stock stock : reception.getMagasin().getStocks()) {
                if (receptionProduit.getProduit().getRef().equals(stock.getProduit().getRef())) {
                    stock.setQuantite(stock.getQuantite().add(receptionProduit.getQuantite()));
                    stock.setQuantiteEntree(receptionProduit.getQuantite());
                    stockService.save(stock);
                    test=true;
                    break;
                }
            }
            if (test == false) {
                Stock stock = new Stock();
                stock.setProduit(receptionProduit.getProduit());
                stock.setMagasin(reception.getMagasin());
                stock.setRef(receptionProduit.getProduit().getRef() + " " + reception.getMagasin().getLibelle());
                stock.setQuantite(receptionProduit.getQuantite());
                stock.setQuantiteEntree(receptionProduit.getQuantite());
                stockService.save(stock);
                test=false;
            }
        }
        receptionDao.save(reception);
        for (ReceptionProduit receptionProduit : reception.getReceptionProduit()) {
            receptionProduit.setReception(reception);
            receptionProduitService.save(receptionProduit);
        }
        return 1;
    }

    @Autowired
    private ReceptionDao receptionDao;

    @Autowired
    private StockService stockService;

    @Autowired
    private ReceptionProduitService receptionProduitService;
}
