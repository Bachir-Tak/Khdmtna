package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Client;
import com.fstg.gestioncommertiale.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ClientProvided {
    @Autowired
    private ClientService clientService;

    public Client findByCin(String cin) {
        return clientService.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin) {
        return clientService.deleteByCin(cin);
    }

    public List<Client> findAll() {
        return clientService.findAll();
    }

    public List<Client> findByVilleNom(String nom) {
        return clientService.findByVilleNom(nom);
    }

    public int save(Client client) {
        return clientService.save(client);
    }
}
