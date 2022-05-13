package com.dev.elmucoSpring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.elmucoSpring.model.Usuario;
import com.dev.elmucoSpring.repository.IUsuarioRepo;

@RestController
@RequestMapping("usuarios")
public class UsuariosRestController {
	
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@GetMapping
	public List<Usuario> listarUsuarios(){
		return usuarioRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarUsuario(@RequestBody Usuario usuario){
		usuarioRepo.save(usuario);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarUsuario(@PathVariable("id") Integer idUsuario) {
		usuarioRepo.deleteById(idUsuario);
	}
}
