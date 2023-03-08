package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Paiement;
import com.fstg.gestioncommertiale.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping ("api/v1/Paiement")
public class PaiementProvided {
    @Autowired
    private PaiementService paiementService;
@GetMapping("/code/{code}")
    public Paiement findByCode(@PathVariable String code) {
        return paiementService.findByCode(code);
    }
@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return paiementService.deleteByCode(code);
    }
@GetMapping("/")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }
@PostMapping("/")
    public int save(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }
}