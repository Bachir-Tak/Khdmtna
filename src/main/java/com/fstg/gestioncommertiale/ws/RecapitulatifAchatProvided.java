package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.RecapitulatifAchat;
import com.fstg.gestioncommertiale.service.RecapitulatifAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/GestionCommertiale/RecapitulatifAchat")
public class RecapitulatifAchatProvided {
    @GetMapping("/code/{code}")
    public RecapitulatifAchat findByCode(@PathVariable String code) {
        return recapitulatifAchatService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return recapitulatifAchatService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<RecapitulatifAchat> findAll() {
        return recapitulatifAchatService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody RecapitulatifAchat recapitulatifAchat) {
        return recapitulatifAchatService.save(recapitulatifAchat);
    }
    @Autowired
    private RecapitulatifAchatService recapitulatifAchatService;

}
