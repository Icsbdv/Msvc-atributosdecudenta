package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="SUCURSALES")
public class Sucursales {


    @Id
    @Column(name="ID_Sucursal")
    private Long idSucursal;


    @Column(name="Nombre")
    private String nombre;


}
