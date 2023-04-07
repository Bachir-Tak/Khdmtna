package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Livraison;
import com.fstg.gestioncommertiale.service.LivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/Livraison")
public class LivraisonProvided {
    @GetMapping("/ref/{ref}")
    public Livraison findByRef(@PathVariable String ref) {
        return livraisonService.findByRef(ref);
    }


    @DeleteMapping("/ref/{ref}")
    @Transactional
    public void deleteByRef(@PathVariable String ref) {
        livraisonService.deleteByRef(ref);
    }
    @PostMapping("/")
    public int save(@RequestBody Livraison livraison) {
        return livraisonService.save(livraison);
    }

    @Autowired
    private LivraisonService livraisonService;
    @GetMapping("/")
    public List<Livraison> findAll() {return livraisonService.findAll();}
}
