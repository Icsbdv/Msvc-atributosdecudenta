package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipocuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.repository.CrudRepository;

public interface TipoCuentaRepository extends CrudRepository<Tipocuenta,Long> {
}
