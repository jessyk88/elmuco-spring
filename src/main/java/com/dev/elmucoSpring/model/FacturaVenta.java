package com.dev.elmucoSpring.model;

import java.util.List;

public class FacturaVenta {
	private Factura factura;
	private List<FacturasProductos> facturasProductos;
	
	public Factura getFactura() {
		return factura;
	}
	
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public List<FacturasProductos> getFacturasProductos() {
		return facturasProductos;
	}
	
	public void setFacturasProductos(List<FacturasProductos> facturasProductos) {
		this.facturasProductos = facturasProductos;
	}
	
	
}
