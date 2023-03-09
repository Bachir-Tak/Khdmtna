package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.DemandeProduit;
import com.fstg.gestioncommertiale.service.DemandeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/demandeProduit")
public class DemandeProduitProvided {
    @Autowired
    private DemandeProduitService demandeProduitService;

    @GetMapping("/ref/{ref}")
    public List<DemandeProduit> findByDemandeRef(@PathVariable String ref) {
        return demandeProduitService.findByDemandeRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByDemandeRef(@PathVariable String ref) {
        return demandeProduitService.deleteByDemandeRef(ref);
    }

    @GetMapping("/")
    public List<DemandeProduit> findAll() {
        return demandeProduitService.findAll();
    }

}
