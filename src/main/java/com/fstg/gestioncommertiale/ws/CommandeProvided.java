package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommertiale/Commande")
public class CommandeProvided {
    @GetMapping("/ref/{ref}")
    public Commande findByRef( @PathVariable String ref) {
        return commandeService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef( @PathVariable String ref) {
        return commandeService.deleteByRef(ref);
    }
    @PostMapping("/")
    public int save( @RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @Autowired
    private CommandeService commandeService;

}
