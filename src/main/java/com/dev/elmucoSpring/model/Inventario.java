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
public class Inventario {
	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_JUST_FOR_TEST", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name = "id_inventario")
	private Integer idInventario;
	
	@JoinColumn(name = "FK_PRODUCTO", nullable = false)
    @ManyToOne(optional = false	)
	private Producto producto;
	
	@Column(name = "cantidad")
	private Long cantidad;
}
