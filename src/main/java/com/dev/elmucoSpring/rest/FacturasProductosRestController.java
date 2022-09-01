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
import com.dev.elmucoSpring.model.FacturasProductos;
import com.dev.elmucoSpring.repository.IFacturasProductosRepo;

@RestController
@RequestMapping("FacturasProductos")
public class FacturasProductosRestController {
	
	@Autowired
	private IFacturasProductosRepo facturasProductosRepo;
	
	@GetMapping
	public List<FacturasProductos> listarFacturasProductos(){
		return facturasProductosRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarFactura_Producto(@RequestBody FacturasProductos facturasProductos){
		facturasProductosRepo.save(facturasProductos);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarProducto(@PathVariable("id") Integer idFacturaProducto) {
	
		facturasProductosRepo.deleteById(idFacturaProducto);
	}
}
