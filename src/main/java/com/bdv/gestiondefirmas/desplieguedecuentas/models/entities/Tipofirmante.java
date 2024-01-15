package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Tipo")
public class Tipofirmante {

    @Id
    @Column(name="ID_Tipo")
    private Long idTipo;


    @Column(name="Tipo")
    private String Tipo;



}
