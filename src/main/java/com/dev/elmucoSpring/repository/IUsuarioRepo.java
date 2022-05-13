package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elmucoSpring.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

}
