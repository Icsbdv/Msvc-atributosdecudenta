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
@Table(name="TIPO_TITULAR")
public class Tipotitular {

    @Id
    @Column(name="ID_TIPO_TITULAR")
    private Integer idTipoTitular;

    @Column(name="TIPO_TITULAR")
    private String tipoTitular;
}
