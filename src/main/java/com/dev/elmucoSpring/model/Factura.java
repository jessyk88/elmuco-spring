package com.dev.elmucoSpring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Factura {
	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_JUST_FOR_TEST", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name = "id_factura")
	private Integer idFactura;
	@JoinColumn(name = "FK_CLIENTE", nullable = false)
    @ManyToOne(optional = false	)
	private Cliente Cliente;
	@JoinColumn(name = "FK_Vendedor", nullable = false)
    @ManyToOne(optional = false	)
	private Vendedor Vendedor;
	@Column(name = "fecha_factura")
	private Date fechaFactura;
	@Column(name = "precio_total")
	private Long Precio_Total;
	public Integer getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public Long getPrecio_Total() {
		return Precio_Total;
	}
	public void setPrecio_Total(Long precio_Total) {
		Precio_Total = precio_Total;
	}

}
