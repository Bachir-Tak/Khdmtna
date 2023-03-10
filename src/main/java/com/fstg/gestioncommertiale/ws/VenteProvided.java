package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.service.VenteProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Vente")
public class VenteProvided {
    @Autowired
    private VenteProduitService venteProduitService;

    @PostMapping("/")
    public int save(@RequestBody VenteProduit venteProduit) {
        return venteProduitService.save(venteProduit);
    }

    @GetMapping("/Produitref/{Produitref}")
    public List<VenteProduit> findByProduitRef(@PathVariable String Produitref) {
        return venteProduitService.findByProduitRef(Produitref);
    }

    @DeleteMapping("/Produitref/{Produitref}")
    @Transactional
    public int deleteByProduitRef(@PathVariable String Produitref) {
        return venteProduitService.deleteByProduitRef(Produitref);
    }

    @GetMapping("/Venteref/{Venteref}")
    public List<VenteProduit> findByVenteRef(@PathVariable String Venteref) {
        return venteProduitService.findByVenteRef(Venteref);
    }

    @DeleteMapping("/Venteref/{Venteref}")
    @Transactional
    public int deleteByVenteRef(String Venteref) {
        return venteProduitService.deleteByVenteRef(Venteref);
    }

    @GetMapping("/")
    public List<VenteProduit> findAll() {
        return venteProduitService.findAll();
    }
}
