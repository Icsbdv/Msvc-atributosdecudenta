package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipoimagen;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tiporegla;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoImagenRepository extends CrudRepository<Tipoimagen,Long> {

    @Query(value="Select a.ID_TipoImagen as ID_Tipo_Imagen," +
            "TipoImagen as Tipo_Imagen " +
            "from TipoImagen a",nativeQuery = true)
    List<Tipoimagen> obtenerTiposImagen();
}
