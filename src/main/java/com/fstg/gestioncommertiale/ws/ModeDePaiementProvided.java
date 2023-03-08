package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.ModeDePaiement;
import com.fstg.gestioncommertiale.service.ModeDePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api/v1/ModeDePaiement")
public class ModeDePaiementProvided {
    @Autowired
    private ModeDePaiementService modeDePaiementService;
@GetMapping("/code/{code}")
    public ModeDePaiement findByCode( @PathVariable String code) {
        return modeDePaiementService.findByCode(code);
    }

@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return modeDePaiementService.deleteByCode(code);
    }
@GetMapping("/")
    public List<ModeDePaiement> findAll() {
        return modeDePaiementService.findAll();
    }
@PostMapping("/")
    public int save(@RequestBody ModeDePaiement modeDePaiement) {
        return modeDePaiementService.save(modeDePaiement);
    }
}
