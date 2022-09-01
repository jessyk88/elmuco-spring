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

import com.dev.elmucoSpring.model.Cliente;
import com.dev.elmucoSpring.repository.IClienteRepo;

@RestController
@RequestMapping("cliente")
public class ClienteRestController {
	
	@Autowired
	private IClienteRepo clienteRepo;
	
	@GetMapping
	public List<Cliente> listarCliente(){
		return clienteRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarCliente(@RequestBody Cliente cliente){
		clienteRepo.save(cliente);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarUsuario(@PathVariable("id") Integer idCliente) {
		clienteRepo.deleteById(idCliente);
	}
}