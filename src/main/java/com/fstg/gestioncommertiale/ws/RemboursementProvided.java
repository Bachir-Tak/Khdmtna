package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Remboursement;
import com.fstg.gestioncommertiale.service.RemboursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/GestionCommertiale/Remboursement")
public class RemboursementProvided {

    @GetMapping("/code/{code}")
    public Remboursement findByCode(@PathVariable String code) {
        return remboursementService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return remboursementService.deleteByCode(code);
    }
     @PostMapping("/")
    public int save(@RequestBody Remboursement remboursement) {
        return remboursementService.save(remboursement);
    }
    @Autowired
    private RemboursementService remboursementService;

}
