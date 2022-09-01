
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

import com.dev.elmucoSpring.model.Factura;
import com.dev.elmucoSpring.repository.IFacturaRepo;

@RestController
@RequestMapping("factura")
public class FacturaRestController {
	
	@Autowired
	private IFacturaRepo facturaRepo;
	
	@GetMapping
	public List<Factura> listarFactura(){
		return facturaRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarFactura(@RequestBody Factura factura){
		facturaRepo.save(factura);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarFactura(@PathVariable("id") Integer idFactura) {
		facturaRepo.deleteById(idFactura);
	}
}
