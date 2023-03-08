package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.Achat;
import com.fstg.gestioncommertiale.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AchatProvided {
    @Autowired
    private AchatService achatService;

    public Achat findByCode(String code) {
        return achatService.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return achatService.deleteByCode(code);
    }

    public int save(Achat achat) {
        return achatService.save(achat);
    }
}
