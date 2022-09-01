package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer> {

}
