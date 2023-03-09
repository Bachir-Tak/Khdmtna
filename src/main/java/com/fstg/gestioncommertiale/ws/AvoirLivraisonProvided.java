package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.AvoirLivraison;
import com.fstg.gestioncommertiale.service.AvoirLivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommerciale/AvoirLivraison")
public class AvoirLivraisonProvided {
    @Autowired
    private AvoirLivraisonService avoirLivraisonService;
    @GetMapping("/code/{code}")
    public AvoirLivraison findByCode(@PathVariable String code) {
        return avoirLivraisonService.findByCode(code);
    }


    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return avoirLivraisonService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody AvoirLivraison avoirLivraison) {
        return avoirLivraisonService.save(avoirLivraison);
    }
}
