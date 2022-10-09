package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IAtributosCuentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;



@Service
@Slf4j
public class IAtributosCuentaServiceImpl implements IAtributosCuentaService {

    @Autowired
    TipoTitularRepository tipoTitularRepository;
    @Autowired
    TipoReglaRepository tipoReglaRepository;
    @Autowired
    TipoImagenRepository tipoImagenRepository;
    @Autowired
    TiposFirmantesRepository tipoCondicionRepository;
    @Autowired
    TipoCuentaRepository tipoCuentaRepository;

    @Autowired
    SucursalesRepository sucursalesRepository;



    @Override
    public List<Tipofirmante> obtenerTiposFirmantes() {
        return (List<Tipofirmante>) tipoCondicionRepository.obtenerTiposFirmantes();
    }

    @Override
    public List<Tipocuenta> obtenerTiposDeCuenta() {
        return (List<Tipocuenta>) tipoCuentaRepository.obtenerTipoCuentas();
    }

    @Override
    public List<Tipoimagen> obtenerTiposDeImagenes() {
        return (List<Tipoimagen>) tipoImagenRepository.obtenerTiposImagen();
    }

    @Override
    public List<Tiporegla> obtenerTiposDeRegla() {

        return (List<Tiporegla>) tipoReglaRepository.obtenerReglas();
    }

    @Override
    public List<Tipotitular> obtenerTiposDeTitular() {
        return (List<Tipotitular>) tipoTitularRepository.obtenerTiposTitulares();
    }

    @Override
    public List<Sucursales> obtenerSucursales() {
            List<Sucursales> sucursales=sucursalesRepository.obtenerSucursales();
            return sucursales;
    }
}
