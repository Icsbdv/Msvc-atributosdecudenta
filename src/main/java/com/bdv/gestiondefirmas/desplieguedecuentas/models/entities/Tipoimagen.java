package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TIPO_IMAGEN")
public class Tipoimagen {

    @Id
    @Column(name="ID_TIPO_IMAGEN")
    private Integer idTipoCuenta;

    @Column(name="TIPO_IMAGEN")
    private String tipoImagen;
}
