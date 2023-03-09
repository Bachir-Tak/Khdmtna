package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Stock;
import com.fstg.gestioncommertiale.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/stock")
public class StockProvided {
    @Autowired
    private StockService stockService;

    @GetMapping("/code/{code}")
    public List<Stock> findByMagasinCode(@PathVariable String code) {
        return stockService.findByMagasinCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByMagasinCode(@PathVariable String code) {
        return stockService.deleteByMagasinCode(code);
    }

    @GetMapping("/ref/{ref}")
    public List<Stock> findByProduitRef(@PathVariable String ref) {
        return stockService.findByProduitRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByProduitRef(@PathVariable String ref) {
        return stockService.deleteByProduitRef(ref);
    }

    @GetMapping("/")
    public List<Stock> findAll() {
        return stockService.findAll();
    }

}
