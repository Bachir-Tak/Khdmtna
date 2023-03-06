package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Demande;
import com.fstg.gestioncommertiale.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemandeProvided {
    @Autowired
    private DemandeService demandeService;
}
