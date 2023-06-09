package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.RecuRemboursement;
import com.fstg.gestioncommertiale.service.RecuRemboursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommerciale/RecuRemboursement")
public class RecuRemboursementProvided {
    @GetMapping("/code/{code}")
    public RecuRemboursement findByCode(@PathVariable String code) {
        return recuRemboursementService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return recuRemboursementService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save( @RequestBody  RecuRemboursement recuRemboursement) {
        return recuRemboursementService.save(recuRemboursement);
    }
    @Autowired
    private RecuRemboursementService recuRemboursementService;
}
