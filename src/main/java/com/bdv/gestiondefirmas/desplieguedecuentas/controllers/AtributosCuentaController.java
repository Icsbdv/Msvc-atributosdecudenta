package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("app")
public class CuentaController {


    @Autowired
    private IAtributosCuentaService atributosCuentaService;

    @GetMapping("getAtributosCuentas")
    public ResponseEntity<?> verAtributos() {

        List<Tipofirmante> tfirmantes=atributosCuentaService.obtenerTiposFirmantes();
        List<Tipocuenta> tcuentas=atributosCuentaService.obtenerTiposDeCuenta();
        List<Tipoimagen> timagen=atributosCuentaService.obtenerTiposDeImagenes();
        List<Tiporegla> tregla=atributosCuentaService.obtenerTiposDeRegla();
        List<Tipotitular> ttitular=atributosCuentaService.obtenerTiposDeTitular();
        List<Sucursales> sucursales=atributosCuentaService.obtenerSucursales();

        Atributocuenta atributocuenta=new Atributocuenta();

        atributocuenta.setTipostitulares(ttitular);




        return ResponseEntity.ok().body(atributocuenta);
    }




}
