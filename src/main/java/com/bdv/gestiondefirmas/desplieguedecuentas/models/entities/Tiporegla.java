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
@Table(name="TIPO_REGLA")
public class Tiporegla {
    @Id
    @Column(name="ID_TIPO_REGLA")
    private Integer idTipoRegla;

    @Column(name="TIPO_REGLA")
    private String tipoRegla;

    @Column(name="STATUS")
    private Integer status;
}
