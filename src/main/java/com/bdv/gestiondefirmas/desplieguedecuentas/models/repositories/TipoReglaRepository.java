package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipofirmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tiporegla;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoReglaRepository extends CrudRepository<Tiporegla,Long> {

    @Query(value="Select a.ID_TipoRegla as ID_Tipo_Regla," +
            "a.TipoRegla as Tipo_Regla," +
            "a.Status " +
            "from TipoRegla a",nativeQuery = true)
    List<Tiporegla> obtenerReglas();
}
