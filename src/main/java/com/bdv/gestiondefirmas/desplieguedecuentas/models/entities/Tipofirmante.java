package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TIPO_FIRMANTE")
public class Tipofirmante {

    @Id
    @Column(name="ID_TIPO")
    private Integer idTipo;


    @Column(name="TIPO")
    private String Tipo;



}
