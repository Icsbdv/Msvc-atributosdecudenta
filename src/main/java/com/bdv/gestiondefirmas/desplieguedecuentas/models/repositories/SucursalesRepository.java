package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sucursales;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SucursalesRepository extends CrudRepository<Sucursales,Long> {
    @Query(value="Select a.ID_Sucursal," +
            "a.Nombre " +
            "from Sucursal a",nativeQuery = true)
    List<Sucursales> obtenerSucursales();

}
