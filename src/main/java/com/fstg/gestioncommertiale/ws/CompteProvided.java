package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Compte;
import com.fstg.gestioncommertiale.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommertiale/Compte")
public class CompteProvided {
    @GetMapping("/emai/{email}")
    public Compte findByEmail(@PathVariable String email) {
        return compteService.findByEmail(email);
    }

    @DeleteMapping("/emai/{email}")
    @Transactional
    public int deleteByEmail(@PathVariable String email) {
        return compteService.deleteByEmail(email);
    }

    @PostMapping("/")
    public int save(@RequestBody Compte compte) {
        return compteService.save(compte);
    }

    @Autowired
    private CompteService compteService;
}
