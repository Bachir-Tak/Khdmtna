package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.DemandeProduit;
import com.fstg.gestioncommertiale.service.DemandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/DemandeProduit")
public class DemandeProduitProvided {
    @Autowired
    private DemandeProduitService demandeProduitService;
    @GetMapping("/code/{code}")
    public List<DemandeProduit> findByDemandeCode( @PathVariable String code) {
        return demandeProduitService.findByDemandeCode(code);
    }
    @DeleteMapping("/code/{code}")

    @Transactional
    public int deleteByDemandeCode( @PathVariable String code) {
        return demandeProduitService.deleteByDemandeCode(code);
    }

    @GetMapping("/")
    public List<DemandeProduit> findAll() {
        return demandeProduitService.findAll();
    }
    @DeleteMapping("/")
    @Transactional
    public void save( @RequestBody DemandeProduit demandeProduit) {
        demandeProduitService.save(demandeProduit);
    }
}
