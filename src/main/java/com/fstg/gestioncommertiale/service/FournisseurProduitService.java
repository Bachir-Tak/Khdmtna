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
    private  FournisseurService fournisseurService;



    public int  save(FournisseurProduit fournisseurProduit){
        if (fournisseurService.findByCode(fournisseurProduit.getFournisseur().getCode())!=null) {
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

    public List<FournisseurProduit> findByFournisseurCode(String code) {
        return fourbisseurProduitDao.findByFournisseurCode(code);
    }
@Transactional
    public int deleteByFournisseurCode(String code) {
        return fourbisseurProduitDao.deleteByFournisseurCode(code);
    }
}
