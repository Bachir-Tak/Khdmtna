package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.ReceptionProduit;
import com.fstg.gestioncommertiale.service.ReceptionProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/receptionProduit")
public class ReceptionProduitProvided {
    @Autowired
    private ReceptionProduitService receptionProduitService;

    @GetMapping("/ref/{ref}")
    public List<ReceptionProduit> findByReceptionRef(@PathVariable String ref) {
        return receptionProduitService.findByReceptionRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByReceptionRef(@PathVariable String ref) {
        return receptionProduitService.deleteByReceptionRef(ref);
    }

    @GetMapping("/")
    public List<ReceptionProduit> findAll() {
        return receptionProduitService.findAll();
    }
    @PostMapping("/")
    public void save( @RequestBody  ReceptionProduit receptionProduit) {
        receptionProduitService.save(receptionProduit);
    }
}
