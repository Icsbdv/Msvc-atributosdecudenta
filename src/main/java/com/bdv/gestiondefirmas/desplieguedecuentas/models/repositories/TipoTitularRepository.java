package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipofirmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoTitularRepository  extends CrudRepository<Tipotitular,Long> {
    @Query(value="Select a.ID_TipoTitular as ID_Tipo_Titular," +
            "a.TipoTitular as Tipo_Titular " +
            "from TipoTitular a",nativeQuery = true)
    List<Tipotitular> obtenerTiposTitulares();
}
