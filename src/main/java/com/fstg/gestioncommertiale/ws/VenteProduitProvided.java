package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.VenteProduit;
import com.fstg.gestioncommertiale.service.VenteProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Venteproduit")
public class VenteProduitProvided {
    @Autowired
    private VenteProduitService venteProduitService;

    @PostMapping("/")
    public int save(@RequestBody VenteProduit venteProduit) {
        return venteProduitService.save(venteProduit);
    }

    @GetMapping("/ProduitRef/{ProduitRef}")
    public List<VenteProduit> findByProduitRef(@PathVariable String ProduitRef) {
        return venteProduitService.findByProduitRef(ProduitRef);
    }

    @DeleteMapping("/ProduitRef/{ProduitRef}")
    @Transactional
    public int deleteByProduitRef(@PathVariable String ProduitRef) {
        return venteProduitService.deleteByProduitRef(ProduitRef);
    }

    @GetMapping("/VenteRef/{VenteRef}")
    public List<VenteProduit> findByVenteRef(@PathVariable String VenteRef) {
        return venteProduitService.findByVenteRef(VenteRef);
    }

    @DeleteMapping("/VenteRef/{VenteRef}")
    @Transactional
    public int deleteByVenteRef(@PathVariable String VenteRef) {
        return venteProduitService.deleteByVenteRef(VenteRef);
    }

    @GetMapping("/")
    public List<VenteProduit> findAll() {
        return venteProduitService.findAll();
    }
}
