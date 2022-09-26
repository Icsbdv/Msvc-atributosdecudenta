package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sucursales;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SucursalesRepository extends CrudRepository<Sucursales,Long> {

}
