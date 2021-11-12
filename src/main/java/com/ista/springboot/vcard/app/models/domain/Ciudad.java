package com.ista.springboot.vcard.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ciudad {
	
	
	@Value("${ciudad.codigo}")
	private Integer codigo_ciudad;
	@Value("${ciudad.nombre}")
	private String nombre_ciudad;
	
	
	
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCodigo_ciudad() {
		return codigo_ciudad;
	}
	public void setCodigo_ciudad(Integer codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}
	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	
	
}
