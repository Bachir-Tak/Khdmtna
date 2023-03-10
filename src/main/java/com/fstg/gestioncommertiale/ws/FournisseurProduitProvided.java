package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import com.fstg.gestioncommertiale.service.FournisseurProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/FournisseurProduit")
public class FournisseurProduitProvided {
    @Autowired
    private FournisseurProduitService fournisseurProduitService;

    @PostMapping("/")
    public int save(@RequestBody FournisseurProduit fournisseurProduit) {
        return fournisseurProduitService.save(fournisseurProduit);
    }

    @GetMapping("/Produitref/{Produitref}")
    public List<FournisseurProduit> findByProduitRef(@PathVariable String Produitref) {
        return fournisseurProduitService.findByProduitRef(Produitref);
    }

    @DeleteMapping("/Produitref/{Produitref}")
    @Transactional
    public int deleteByProduitRef( @PathVariable String Produitref) {
        return fournisseurProduitService.deleteByProduitRef(Produitref);
    }

    @GetMapping("fournisseurCode/{fournisseurCode}")
    public List<FournisseurProduit> findByFournisseurCode( @PathVariable String fournisseurCode) {
        return fournisseurProduitService.findByFournisseurCode(fournisseurCode);
    }

    @DeleteMapping("/fournisseurCode/{fournisseurCode}")
    @Transactional
    public int deleteByFournisseurCode( @PathVariable String fournisseurCode) {
        return fournisseurProduitService.deleteByFournisseurCode(fournisseurCode);
    }

    @GetMapping("/")
    public List<FournisseurProduit> findAll() {
        return fournisseurProduitService.findAll();
    }
}
