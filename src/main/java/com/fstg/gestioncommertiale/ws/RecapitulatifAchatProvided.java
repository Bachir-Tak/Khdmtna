package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.service.RecapitulatifAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RecapitulatifAchatProvided {
    @Autowired
    private RecapitulatifAchatService recapitulatifAchatService;
}
