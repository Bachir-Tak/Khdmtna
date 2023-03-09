package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.bean.AchatCommande;
import com.fstg.gestioncommertiale.service.AchatCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/AchatCommande")
public class AchatCommandeProvided {
    @GetMapping("/code/{code}")
    public List<AchatCommande> findByAchatCode( @PathVariable String code) {
        return achatCommandeService.findByAchatCode(code);
    }
     @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByAchatCode(@PathVariable String code) {
        return achatCommandeService.deleteByAchatCode(code);
    }
     @GetMapping("/ref/{ref}")
    public List<AchatCommande> findByCommandeRef( @PathVariable String ref) {
        return achatCommandeService.findByCommandeRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByCommandeRef( @PathVariable String ref) {
        return achatCommandeService.deleteByCommandeRef(ref);
    }
    @PostMapping("/")
    public int save(@RequestBody AchatCommande achatCommande) {
        return achatCommandeService.save(achatCommande);
    }
    @Autowired
    private AchatCommandeService achatCommandeService;

}
