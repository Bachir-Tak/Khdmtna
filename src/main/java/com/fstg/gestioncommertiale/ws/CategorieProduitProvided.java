package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.CategorieProduit;
import com.fstg.gestioncommertiale.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping
public class CategorieProduitProvided {
    @Autowired
    private CategorieProduitService categorieProduitService;

    public CategorieProduit findByCode(String code) {
        return categorieProduitService.findByCode(code);
    }

    public int save(CategorieProduit categorieProduit) {
        return categorieProduitService.save(categorieProduit);
    }

    @Transactional
    public int deleteByCode(String code) {
        return categorieProduitService.deleteByCode(code);
    }

    public List<CategorieProduit> findAll() {
        return categorieProduitService.findAll();
    }
}
