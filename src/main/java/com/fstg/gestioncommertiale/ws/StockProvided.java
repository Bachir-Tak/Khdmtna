package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Stock;
import com.fstg.gestioncommertiale.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommerciale/Stock")
public class StockProvided {
    @Autowired
    private StockService stockService;

    @GetMapping("/code/{code}")
    public List<Stock> findByMagasinCode(@PathVariable String code) {
        return stockService.findByMagasinCode(code);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByMagasinCode(@PathVariable String code) {
        return stockService.deleteByMagasinCode(code);
    }

    @GetMapping("/ref/{ref}")
    public List<Stock> findByProduitRef(@PathVariable String ref) {
        return stockService.findByProduitRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByProduitRef(@PathVariable String ref) {
        return stockService.deleteByProduitRef(ref);
    }

    @GetMapping("/")
    public List<Stock> findAll() {
        return stockService.findAll();
    }
    @PostMapping("/")
    public void save( @RequestBody Stock stock) {
        stockService.save(stock);
    }
}
