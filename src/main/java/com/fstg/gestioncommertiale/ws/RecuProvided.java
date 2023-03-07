package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Recu;
import com.fstg.gestioncommertiale.service.RecuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController @RequestMapping("api/v1/Recu")
public class RecuProvided {
    @Autowired
    private RecuService recuService ;
@GetMapping("/code/{code}")
    public Recu findByCode(@PathVariable String code) {
        return recuService.findByCode(code);
    }
@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return recuService.deleteByCode(code);
    }
@GetMapping("/")
    public List<Recu> findAll() {
        return recuService.findAll();
    }
@PostMapping("/")
    public int save(@RequestBody Recu recu) {
        return recuService.save(recu);
    }
}
