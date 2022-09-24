package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tiporegla;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.repository.CrudRepository;

public interface TipoReglaRepository extends CrudRepository<Tiporegla,Long> {
}
