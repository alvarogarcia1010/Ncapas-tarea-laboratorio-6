package com.uca.capas.practico.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema="public", name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name="c_contribuyente")
	private Integer codigoContribuyente;
	
	@Column(name="c_importancia")
	private String codigoImportancia;
	
	public String getCodigoImportancia() {
		return codigoImportancia;
	}

	public void setCodigoImportancia(String codigoImportancia) {
		this.codigoImportancia = codigoImportancia;
	}

	@Column(name="s_nombre")
	@Size(message="El campo no debe contener mas de 30 caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Column(name="s_apellido")
	@Size(message="El campo no debe contener mas de 30 caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String apellido;
	
	@Column(name="s_nit")
	@Size(message="El campo no debe contener mas de 14 caracteres", max=14)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nit;
	
	@NotNull(message = "El campo Fecha no puede quedar vacio")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "f_nacimiento")
	private Date fechaIngreso;
	
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Importancia importancia;
	
	public Contribuyente() {super();}

	public Integer getCodigoContribuyente() {
		return codigoContribuyente;
	}

	public void setCodigoContribuyente(Integer codigoContribuyente) {
		this.codigoContribuyente = codigoContribuyente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}