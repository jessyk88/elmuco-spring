package com.dev.elmucoSpring.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.elmucoSpring.model.Usuario;
import com.dev.elmucoSpring.model.UsuarioLogin;
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
	
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UsuarioLogin usuarioLogin) {
		Usuario usuario =usuarioRepo.login(usuarioLogin.getCorreo(), usuarioLogin.getClave());
		if(usuario ==  null) {
			Map<String, Object> response = new HashMap<>();
			response.put("mensaje", "Usuario o clave erronea");
			response.put("codigo", 404);
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.NOT_FOUND);
		}else {			
			return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
		}
	}
}
