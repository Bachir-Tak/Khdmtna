package com.fstg.gestioncommertiale.service;

import com.fstg.gestioncommertiale.bean.Client;
import com.fstg.gestioncommertiale.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.util.List;

@Service
public class ClientService {

    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }
    @Transactional
    public int deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }


    public int save(Client client) {
        Client clt = findByCin(client.getCin());
        if (clt != null) {
            return -1;
        }
        clientDao.save(client);
        return 1;
        }


    @Autowired
    private ClientDao clientDao;



}
