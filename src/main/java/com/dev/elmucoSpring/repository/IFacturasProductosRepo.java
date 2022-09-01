package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.FacturasProductos;

public interface IFacturasProductosRepo extends JpaRepository<FacturasProductos, Integer> {

}
