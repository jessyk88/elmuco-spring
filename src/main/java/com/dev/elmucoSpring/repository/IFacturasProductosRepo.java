package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.elmucoSpring.model.FacturasProductos;

public interface IFacturasProductosRepo extends JpaRepository<FacturasProductos, Integer> {
	
	@Query(
			value ="delete from facturas_productos where fk_factura = :idFactura",
			nativeQuery = true
			)
	void deleteByIdFactura(@Param("idFactura") Integer idFactura);

}
