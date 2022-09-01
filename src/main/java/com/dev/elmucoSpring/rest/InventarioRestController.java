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

import com.dev.elmucoSpring.model.Inventario;
import com.dev.elmucoSpring.repository.IInventarioRepo;


@RestController
@RequestMapping("inventario")
public class InventarioRestController {
	@Autowired
	private IInventarioRepo inventarioRepo;
	
	@GetMapping
	public List<Inventario> listarInventario(){
		return inventarioRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarInventario(@RequestBody Inventario inventario){
		inventarioRepo.save(inventario);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarInventario(@PathVariable("id") Integer idinventario) {
		inventarioRepo.deleteById(idinventario);
	}
}
