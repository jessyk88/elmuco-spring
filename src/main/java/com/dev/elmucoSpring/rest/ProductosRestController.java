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

import com.dev.elmucoSpring.model.Producto;
import com.dev.elmucoSpring.repository.IProductoRepo;

@RestController
@RequestMapping("productos")
public class ProductosRestController extends CORSConfig {
	
	@Autowired
	private IProductoRepo productoRepo;
	
	@GetMapping
	public List<Producto> listarProducto(){
		return productoRepo.findAll();
	}
	
	@PostMapping
	public void agregarActualizarProducto(@RequestBody Producto producto){
		productoRepo.save(producto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarProducto(@PathVariable("id") Integer idProducto) {
		productoRepo.deleteById(idProducto);
	}
}
