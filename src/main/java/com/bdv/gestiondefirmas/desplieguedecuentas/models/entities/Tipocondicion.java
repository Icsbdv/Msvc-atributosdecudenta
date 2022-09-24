package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TIPO_CONDICION")
public class Tipocondicion {

    @Id
    @Column(name="ID_TIPO")
    private Integer idTipo;


    @Column(name="TIPO")
    private String Tipo;



}
