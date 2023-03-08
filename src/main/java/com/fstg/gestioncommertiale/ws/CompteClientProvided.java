package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.CompteClient;
import com.fstg.gestioncommertiale.service.CompteClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompteClientProvided {
    @Autowired
    private CompteClientService compteClientService;

    public CompteClient findByEmail(String email) {
        return compteClientService.findByEmail(email);
    }
    @Transactional
    public int deleteByEmail(String email) {
        return compteClientService.deleteByEmail(email);
    }

    public int save(CompteClient compteClient) {
        return compteClientService.save(compteClient);
    }
}
