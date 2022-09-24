package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipoimagen;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.repository.CrudRepository;

public interface TipoImagenRepository extends CrudRepository<Tipoimagen,Long> {
}
