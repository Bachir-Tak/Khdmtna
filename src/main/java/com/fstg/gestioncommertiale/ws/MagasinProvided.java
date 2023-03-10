package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Magasin;
import com.fstg.gestioncommertiale.service.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/magasin")
public class MagasinProvided {
    @Autowired
    private MagasinService magasinService;

    @GetMapping("/code/{code}")

    public Magasin findByCode(@PathVariable String code) {
        return magasinService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return magasinService.deleteByCode(code);
    }

    @GetMapping("/")

    public List<Magasin> findAll() {
        return magasinService.findAll();
    }

    @PostMapping("/")

    public int save(@RequestBody Magasin magasin) {
        return magasinService.save(magasin);
    }
}
