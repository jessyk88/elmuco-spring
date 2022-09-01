package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}