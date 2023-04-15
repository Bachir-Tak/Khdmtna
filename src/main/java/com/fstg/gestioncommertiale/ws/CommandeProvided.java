package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Commande")
public class CommandeProvided {
    @GetMapping("/ref/{ref}")
    public Commande findByRef(@PathVariable String ref) {
        return commandeService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return commandeService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }
    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
    @GetMapping("/cin/{cin}")
    public List<Commande> findByClientCin(@PathVariable String cin) {
        return commandeService.findByClientCin(cin);
    }

    @Autowired
    private CommandeService commandeService;



}
