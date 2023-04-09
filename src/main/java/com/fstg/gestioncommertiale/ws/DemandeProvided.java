package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Demande;
import com.fstg.gestioncommertiale.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Demande")
public class DemandeProvided {
    @Autowired
    private DemandeService demandeService;
    @GetMapping("/code/{code}")
    public Demande findByCode(@PathVariable String code) {
        return demandeService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return demandeService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody Demande demande) {
        return demandeService.save(demande);
    }
    @GetMapping("/")
    public List<Demande> findAll() {
        return demandeService.findAll();
    }
}
