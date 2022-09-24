package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Atributocuenta {


    private List<Tipocondicion> condiciones;
    private List<Tipocuenta> tiposcuenta;
    private List<Tipoimagen> tiposimagenes;
    private List<Tiporegla> tiposreglas;
    private List<Tipotitular> tipostitulares;



}
