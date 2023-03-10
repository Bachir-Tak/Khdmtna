package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Ville;
import com.fstg.gestioncommertiale.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommertiale/Ville")
public class VilleProvided {
    @GetMapping("/nom/{nom}")
    public Ville findByNom(@PathVariable String nom) {
        return villeService.findByNom(nom);
    }

    @DeleteMapping("/nom/{nom}")
    @Transactional
    public int deleteByNom(@PathVariable String nom) {
        return villeService.deleteByNom(nom);
    }

    @PostMapping("/")
    public int save(@RequestBody Ville ville) {
        return villeService.save(ville);
    }

    @Autowired
    private VilleService villeService;
}
