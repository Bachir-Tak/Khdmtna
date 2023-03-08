package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommertiale/Achat")
public class AchatProvided {
    @GetMapping("/code/{code}")
    public Achat findByCode( @PathVariable  String code) {
        return achatService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode( @PathVariable String code) {
        return achatService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save( @RequestBody Achat achat) {
        return achatService.save(achat);
    }
    @Autowired
    private AchatService achatService;

}
