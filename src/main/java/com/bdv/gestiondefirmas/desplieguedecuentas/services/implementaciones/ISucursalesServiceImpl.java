package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sucursales;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SelloRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SucursalesRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISucursalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISucursalesServiceImpl implements ISucursalesService {

    @Autowired
    SucursalesRepository sucursalesRepository;

    @Override
    public List<Sucursales> findAll() {
        return (List<Sucursales>) sucursalesRepository.findAll();
    }
}
