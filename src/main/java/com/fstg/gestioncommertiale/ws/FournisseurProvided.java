package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.FournisseurProduit;
import com.fstg.gestioncommertiale.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FournisseurProvided {
    @Autowired
    private FournisseurService fournisseurService;
}
