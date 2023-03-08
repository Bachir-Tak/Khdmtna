package com.fstg.gestioncommertiale.ws;

import com.fstg.gestioncommertiale.bean.HistoriqueAchat;
import com.fstg.gestioncommertiale.service.HistoriqueAchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HistoriqueAchatProvided {
    @Autowired
    private HistoriqueAchatService historiqueAchatService;

    public HistoriqueAchat findByRef(String ref) {
        return historiqueAchatService.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return historiqueAchatService.deleteByRef(ref);
    }
}
