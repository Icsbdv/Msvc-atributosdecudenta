package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipofirmante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiposFirmantesRepository extends CrudRepository<Tipofirmante,Long> {
    /*@Query(value="Select a.ID_Tipo," +
            "a.Tipo " +
            "from Tipo a",nativeQuery = true)*/
	
   // List<Tipofirmante> obtenerTiposFirmantes();
}
