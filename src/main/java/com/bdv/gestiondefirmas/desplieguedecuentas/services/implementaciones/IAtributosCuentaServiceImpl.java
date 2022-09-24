package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IAtributosCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class IAtributosCuentaServiceImpl implements IAtributosCuentaService {

    @Autowired
    TipoTitularRepository tipoTitularRepository;
    @Autowired
    TipoReglaRepository tipoReglaRepository;
    @Autowired
    TipoImagenRepository tipoImagenRepository;
    @Autowired
    TipoCondicionRepository tipoCondicionRepository;
    @Autowired
    TipoCuentaRepository tipoCuentaRepository;



    @Override
    public List<Tipocondicion> obtenerCondiciones() {
        return (List<Tipocondicion>) tipoCondicionRepository.findAll();
    }

    @Override
    public List<Tipocuenta> obtenerTiposDeCuenta() {
        return (List<Tipocuenta>) tipoCuentaRepository.findAll();
    }

    @Override
    public List<Tipoimagen> obtenerTiposDeImagenes() {
        return (List<Tipoimagen>) tipoImagenRepository.findAll();
    }

    @Override
    public List<Tiporegla> obtenerTiposDeRegla() {
        return (List<Tiporegla>) tipoReglaRepository.findAll();
    }

    @Override
    public List<Tipotitular> obtenerTiposDeTitular() {
        return (List<Tipotitular>) tipoTitularRepository.findAll();
    }
}
