package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Vendedor;

public interface IVendedorRepo extends JpaRepository<Vendedor, Integer> {

}