package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.repository.CrudRepository;

public interface TipoTitularRepository  extends CrudRepository<Tipotitular,Long> {
}
