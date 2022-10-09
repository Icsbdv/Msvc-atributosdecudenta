package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IAtributosCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("app")
public class AtributosCuentaController {


    @Autowired
    private IAtributosCuentaService atributosCuentaService;


    @GetMapping("getAtributosCuentas")
    public ResponseEntity<?> verAtributos() {

        List<Tipofirmante> tiposDeFirmantes=atributosCuentaService.obtenerTiposFirmantes();
        List<Tipocuenta> tiposDeCuenta=atributosCuentaService.obtenerTiposDeCuenta();
        List<Tipoimagen> tiposDeImgenes=atributosCuentaService.obtenerTiposDeImagenes();
        List<Tiporegla> tiposDeReglas=atributosCuentaService.obtenerTiposDeRegla();
        List<Tipotitular> tiposDeTitulares=atributosCuentaService.obtenerTiposDeTitular();
        List<Sucursales> sucursales=atributosCuentaService.obtenerSucursales();

        Atributocuenta atributocuenta=new Atributocuenta(tiposDeFirmantes,tiposDeCuenta,
                tiposDeImgenes,tiposDeReglas,tiposDeTitulares,sucursales);



        return ResponseEntity.ok().body(atributocuenta);

    }









    }





