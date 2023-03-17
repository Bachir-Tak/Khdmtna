package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.LivraisonCommande;
import com.fstg.gestioncommertiale.service.LivraisonCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/LivraisonCommande")
public class LivraisonCommandeProvided {
    @GetMapping("/livraisonRef/{livraisonRef}")
    public List<LivraisonCommande> findByLivraisonRef( @PathVariable String  livraisonRef) {
        return livraisonCommandeService.findByLivraisonRef(livraisonRef);
    }
    @DeleteMapping("/livraisonRef/{livraisonRef}")
    @Transactional
    public int deleteByLivraisonRef(@PathVariable String livraisonRef) {
        return livraisonCommandeService.deleteByLivraisonRef(livraisonRef);
    }
    @GetMapping("/ref/{ref}")
    public List<LivraisonCommande> findByCommandeRef(@PathVariable String ref) {
        return livraisonCommandeService.findByCommandeRef(ref);
    }
    @DeleteMapping("/commandeRef/{commandeRef}")
    @Transactional
    public int deleteByCommandeRef(@PathVariable String commandeRef) {
        return livraisonCommandeService.deleteByCommandeRef(commandeRef);
    }
    @PostMapping("/")
    public int save( @RequestBody LivraisonCommande livraisonCommande) {
        return livraisonCommandeService.save(livraisonCommande);
    }

    @Autowired
    private LivraisonCommandeService livraisonCommandeService;
}
