package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipocondicion;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.repository.CrudRepository;

public interface TipoCondicionRepository extends CrudRepository<Tipocondicion,Long> {
}
