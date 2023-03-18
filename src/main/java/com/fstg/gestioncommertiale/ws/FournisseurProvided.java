package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Fournisseur;
import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import com.fstg.gestioncommertiale.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Fournisseur")
public class FournisseurProvided {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/code/{code}")
    public Fournisseur findByCode(@PathVariable String code) {
        return fournisseurService.findByCode(code);
    }

    @PostMapping("/")
    public int save(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }

    @GetMapping("/nom/{nom}")
    public List<Fournisseur> findByVilleNom(@PathVariable String nom) {
        return fournisseurService.findByVilleNom(nom);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return fournisseurService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }
}
