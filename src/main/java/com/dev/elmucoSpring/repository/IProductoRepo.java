package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
