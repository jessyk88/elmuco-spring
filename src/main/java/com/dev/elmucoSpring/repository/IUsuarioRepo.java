package com.dev.elmucoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.elmucoSpring.model.Usuario;
import com.dev.elmucoSpring.model.UsuarioLogin;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	@Query("SELECT u FROM Usuario u WHERE u.correo = :correo and u.clave = :clave")
	 Usuario login(
			 @Param("correo") String correo,
			 @Param("clave") String clave
			 );

}
