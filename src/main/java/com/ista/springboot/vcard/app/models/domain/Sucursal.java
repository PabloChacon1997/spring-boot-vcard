package com.ista.springboot.vcard.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Sucursal {
	
	@Value("${sucursal.codigo}")
	private Integer codigo_sucursal;
	
	@Autowired
	@Value("${ciudad.codigo}")
	private String codigo_ciudad;
	
	@Value("${sucursal.nombre}")
	private String nombre_sucursal;
	
	
	
	public Sucursal() {
		
	}
	public Integer getCodigo_sucursal() {
		return codigo_sucursal;
	}
	public void setCodigo_sucursal(Integer codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}
	public String getCodigo_ciudad() {
		return codigo_ciudad;
	}
	public void setCodigo_ciudad(String codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}
	public String getNombre_sucursal() {
		return nombre_sucursal;
	}
	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	
	
	
}
