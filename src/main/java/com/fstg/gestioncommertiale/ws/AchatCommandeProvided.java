package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.bean.AchatCommande;
import com.fstg.gestioncommertiale.service.AchatCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AchatCommandeProvided {
    @Autowired
    private AchatCommandeService achatCommandeService;

    public List<AchatCommande> findByAchatCode(String code) {
        return achatCommandeService.findByAchatCode(code);
    }

    @Transactional
    public int deleteByAchatCode(String code) {
        return achatCommandeService.deleteByAchatCode(code);
    }

    public List<AchatCommande> findByCommandeRef(String ref) {
        return achatCommandeService.findByCommandeRef(ref);
    }

    @Transactional
    public int deleteByCommandeRef(String ref) {
        return achatCommandeService.deleteByCommandeRef(ref);
    }

//    public int save(Achat achat, List<AchatCommande> achatCommandes) {
//        return achatCommandeService.save(achat, achatCommandes);
//    }
}
