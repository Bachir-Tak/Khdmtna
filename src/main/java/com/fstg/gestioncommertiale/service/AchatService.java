package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.bean.AchatCommande;
import com.fstg.gestioncommertiale.bean.Client;
import com.fstg.gestioncommertiale.dao.AchatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AchatService {

    public Achat findByCode(String code) {
        return achatDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return achatDao.deleteByCode(code);
    }


    public int save(Achat achat) {
        if (findByCode(achat.getCode()) != null) {
            return -1;
        }
        Client client = clientService.findByCin(achat.getClient().getCin());
        if (client != null) {
            achat.setClient(clientService.findByCin(achat.getClient().getCin()));
        }
        clientService.save(achat.getClient());
        achatDao.save(achat);
        // for (AchatCommande achatCommande : achat.getAchatCommandes()) {
        // achatCommande.setAchat(achat);
        // achatCommandeService.save(achatCommande);


        return 1;
    }

           @Autowired
           private AchatDao achatDao;
            @Autowired
            private AchatCommandeService achatCommandeService;
            @Autowired
            private ClientService clientService;
}
