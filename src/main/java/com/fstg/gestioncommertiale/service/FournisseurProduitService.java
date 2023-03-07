package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import com.fstg.gestioncommertiale.dao.FourbisseurProduitDao;
import com.fstg.gestioncommertiale.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FournisseurProduitService {
    @Autowired
    private FourbisseurProduitDao fourbisseurProduitDao;
    @Autowired
    private FournisseurDao fournisseurDao;

    public Fournisseur findByCode(String code) {
        return fournisseurDao.findByCode(code);
    }

    public int  save(FournisseurProduit fournisseurProduit, Fournisseur fournisseur){
        if (findByFournisseurCode(fournisseur.getCode()) != null) {
            return -1;
        }else {
            fourbisseurProduitDao.save(fournisseurProduit);
            return 1;
        }


    }

    public List<FournisseurProduit> findByProduitRef(String ref) {
        return fourbisseurProduitDao.findByProduitRef(ref);
    }
@Transactional
    public int deleteByProduitRef(String ref) {
        return fourbisseurProduitDao.deleteByProduitRef(ref);
    }

    public List<FournisseurProduit> findByProduitId(Long id) {
        return fourbisseurProduitDao.findByProduitId(id);
    }
    @Transactional
    public int deleteByProduitId(Long id) {
        return fourbisseurProduitDao.deleteByProduitId(id);
    }

    public List<FournisseurProduit> findByFournisseurCode(String code) {
        return fourbisseurProduitDao.findByFournisseurCode(code);
    }
    @Transactional
    public int deleteByFournisseurCode(String code) {
        return fourbisseurProduitDao.deleteByFournisseurCode(code);
    }

    public List<FournisseurProduit> findByFournisseurId(Long id) {
        return fourbisseurProduitDao.findByFournisseurId(id);
    }
    @Transactional
    public int deleteByFournisseurId(Long id) {
        return fourbisseurProduitDao.deleteByFournisseurId(id);
    }
}
