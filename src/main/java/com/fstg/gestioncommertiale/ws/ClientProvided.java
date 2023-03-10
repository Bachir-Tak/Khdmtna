package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Client;
import com.fstg.gestioncommertiale.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/Client")
public class ClientProvided {
    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    @Transactional
    public int deleteByCin(@PathVariable String cin) {
        return clientService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping("/nom/{nom}")
    public List<Client> findByVilleNom(@PathVariable String nom) {
        return clientService.findByVilleNom(nom);
    }

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @Autowired
    private ClientService clientService;


}
