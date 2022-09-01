package com.dev.elmucoSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class FacturasProductos {
	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_JUST_FOR_TEST", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name = "id_factura_producto")
	private Integer idFacturaProducto;
	
	@JoinColumn(name = "FK_FACTURA", nullable = false)
    @ManyToOne(optional = false	)
	private Factura idFactura;
	
	@JoinColumn(name = "FK_PRODUCTO", nullable = false)
    @ManyToOne(optional = false	)
	private Producto producto;
	
	@Column(name = "cantidad")
	private Long cantidad;
	
	@Column(name = "total")
	private Long total;


	public Integer getIdFacturaProducto() {
		return idFacturaProducto;
	}

	public void setIdFacturaProducto(Integer idFacturaProducto) {
		this.idFacturaProducto = idFacturaProducto;
	}


	public Factura getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Factura idFactura) {
		this.idFactura = idFactura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
}
