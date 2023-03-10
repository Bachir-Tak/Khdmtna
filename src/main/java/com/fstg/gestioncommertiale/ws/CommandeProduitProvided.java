package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Commande;
import com.fstg.gestioncommertiale.bean.CommandeProduit;
import com.fstg.gestioncommertiale.service.CommandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/CommandeProduit")
public class CommandeProduitProvided {
    @GetMapping("ProduitRef/{ProduitRef}")
    public List<CommandeProduit> findByProduitRef(@PathVariable String ProduitRef) {
        return commandeProduitService.findByProduitRef(ProduitRef);
    }

    @DeleteMapping("ProduitRef/{ProduitRef}")
    @Transactional
    public int deleteByProduitRef(@PathVariable String ProduitRef) {
        return commandeProduitService.deleteByProduitRef(ProduitRef);
    }

    @GetMapping("/ClientRef/{ClientRef}")
    public List<CommandeProduit> findByCommandeRef(@PathVariable String ClientRef) {
        return commandeProduitService.findByCommandeRef(ClientRef);
    }

    @DeleteMapping("/ClientRef/{ClientRef}")
    @Transactional
    public int deleteByCommandeRef(@PathVariable String ClientRef) {
        return commandeProduitService.deleteByCommandeRef(ClientRef);
    }

    @PostMapping("/")
    public void save(@RequestBody Commande commande, List<CommandeProduit> commandeProduits) {
        commandeProduitService.save(commande, commandeProduits);
    }

    @Autowired
    private CommandeProduitService commandeProduitService;
}
