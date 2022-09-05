
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
import com.dev.elmucoSpring.model.FacturaVenta;
import com.dev.elmucoSpring.model.FacturasProductos;
import com.dev.elmucoSpring.repository.IFacturaRepo;
import com.dev.elmucoSpring.repository.IFacturasProductosRepo;

@RestController
@RequestMapping("factura")
public class FacturaRestController {
	
	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Autowired
	private IFacturasProductosRepo facturasProductosRepo;
	
	@GetMapping
	public List<Factura> listarFactura(){
		List<Factura> facturas = facturaRepo.findAll();
		return facturas;
	}
	
	@PostMapping
	public void agregarActualizarFactura(@RequestBody FacturaVenta facturaVenta){
		Factura factura= facturaRepo.save(facturaVenta.getFactura());
		for (FacturasProductos facturaProducto : facturaVenta.getFacturasProductos()) {
			facturaProducto.setIdFactura(factura);
			facturasProductosRepo.save(facturaProducto);
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarFactura(@PathVariable("id") Integer idFactura) {
		try {
			facturasProductosRepo.deleteByIdFactura(idFactura);	
		}catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
		facturaRepo.deleteById(idFactura);
	}
}
