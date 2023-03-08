package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.HistoriqueAchat;
import com.fstg.gestioncommertiale.service.HistoriqueAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GestionCommertiale/HistoriqueAchat")
public class HistoriqueAchatProvided {
    @GetMapping("/ref/{ref}")
    public HistoriqueAchat findByRef(@PathVariable String ref) {
        return historiqueAchatService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return historiqueAchatService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody HistoriqueAchat historiqueAchat) {
        return historiqueAchatService.save(historiqueAchat);
    }

    @Autowired
    private HistoriqueAchatService historiqueAchatService;
}
