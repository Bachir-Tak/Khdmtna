package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Magasin;
import com.fstg.gestioncommertiale.bean.Reception;
import com.fstg.gestioncommertiale.service.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RestController
@RequestMapping("/GestionCommertiale/reception")
public class ReceptionProvided {
    @Autowired
    private ReceptionService receptionService;

    @GetMapping("/ref/{ref}")
    public Reception findByRef(@PathVariable String ref) {
        return receptionService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return receptionService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Reception> findAll() {
        return receptionService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Reception reception, @RequestBody Magasin magasin) {
        return receptionService.save(reception, magasin);
    }
}
