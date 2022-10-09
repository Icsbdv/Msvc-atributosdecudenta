package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipocuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipofirmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Tipotitular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoCuentaRepository extends CrudRepository<Tipocuenta,Long> {

    @Query(value="Select a.ID_TipoCuenta as ID_Tipo_Cuenta," +
            "a.TipoCuenta as Tipo_Cuenta " +
            "from TipoCuenta a",nativeQuery = true)
    List<Tipocuenta> obtenerTipoCuentas();
}
