package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.CategorieProduit;
import com.fstg.gestioncommertiale.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/CategorieProduit")
public class CategorieProduitProvided {
    @Autowired
    private CategorieProduitService categorieProduitService;

    @GetMapping("/code/{code}")
    public CategorieProduit findByCode(@PathVariable String code) {
        return categorieProduitService.findByCode(code);
    }

    @PostMapping("/")
    public int save(@RequestBody CategorieProduit categorieProduit) {
        return categorieProduitService.save(categorieProduit);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieProduitService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<CategorieProduit> findAll() {
        return categorieProduitService.findAll();
    }
}
