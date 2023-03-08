package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Produit;
import com.fstg.gestioncommertiale.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Produit")
public class ProduitProvided {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/ref/{ref}")
    public Produit findByRef(@PathVariable String ref) {
        return produitService.findByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    public int update(Produit produit, Long prixVente) {
        return produitService.update(produit, prixVente);
    }

    @PostMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return produitService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
}
