package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Inventario;

public interface IInventarioRepo extends JpaRepository<Inventario, Integer> {

}
