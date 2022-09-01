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

import com.dev.elmucoSpring.model.Vendedor;
import com.dev.elmucoSpring.repository.IVendedorRepo;

@RestController
@RequestMapping("vendedor")
public class VendedorRestController {
	
	@Autowired
	private IVendedorRepo VendedorRepo;
	
	@GetMapping
	public List<Vendedor> listarVendedor(){
		return VendedorRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarVendedor (@RequestBody Vendedor vendedor){
		VendedorRepo.save(vendedor);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarVendedor (@PathVariable("id") Integer idVendedor) {
		VendedorRepo.deleteById(idVendedor);
	}
	
}
