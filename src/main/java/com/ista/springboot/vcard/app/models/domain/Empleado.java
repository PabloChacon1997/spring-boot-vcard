package com.ista.springboot.vcard.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Empleado {
	
	
	private Integer codigo_empleado;
	private String nombre_empleado;
	private String puesto_empleado;
	private String horario_empleado;
	private String correo_empleado;
	private String celular_empleado;
	private String paginWeb_empleado;
	private String foto_empleado;
	
	@Autowired
	private Ciudad codigo_ciudad;
	
	@Autowired
	private Sucursal codigo_sucursal;
	
	
	
	
	
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public Empleado(Integer codigo_empleado, String nombre_empleado, String puesto_empleado, String horario_empleado,
			String correo_empleado, String celular_empleado, String paginWeb_empleado, String foto_empleado,
			Ciudad codigo_ciudad, Sucursal codigo_sucursal) {
		super();
		this.codigo_empleado = codigo_empleado;
		this.nombre_empleado = nombre_empleado;
		this.puesto_empleado = puesto_empleado;
		this.horario_empleado = horario_empleado;
		this.correo_empleado = correo_empleado;
		this.celular_empleado = celular_empleado;
		this.paginWeb_empleado = paginWeb_empleado;
		this.foto_empleado = foto_empleado;
		this.codigo_ciudad = codigo_ciudad;
		this.codigo_sucursal = codigo_sucursal;
	}
	
	
	public Integer getCodigo_empleado() {
		return codigo_empleado;
	}
	public void setCodigo_empleado(Integer codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}
	public String getNombre_empleado() {
		return nombre_empleado;
	}
	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	public String getPuesto_empleado() {
		return puesto_empleado;
	}
	public void setPuesto_empleado(String puesto_empleado) {
		this.puesto_empleado = puesto_empleado;
	}
	public String getHorario_empleado() {
		return horario_empleado;
	}
	public void setHorario_empleado(String horario_empleado) {
		this.horario_empleado = horario_empleado;
	}
	public String getCorreo_empleado() {
		return correo_empleado;
	}
	public void setCorreo_empleado(String correo_empleado) {
		this.correo_empleado = correo_empleado;
	}
	public String getCelular_empleado() {
		return celular_empleado;
	}
	public void setCelular_empleado(String celular_empleado) {
		this.celular_empleado = celular_empleado;
	}
	public String getPaginWeb_empleado() {
		return paginWeb_empleado;
	}
	public void setPaginWeb_empleado(String paginWeb_empleado) {
		this.paginWeb_empleado = paginWeb_empleado;
	}
	
	public String getFoto_empleado() {
		return foto_empleado;
	}
	public void setFoto_empleado(String foto_empleado) {
		this.foto_empleado = foto_empleado;
	}
	public Ciudad getCodigo_ciudad() {
		return codigo_ciudad;
	}
	public void setCodigo_ciudad(Ciudad codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}
	public Sucursal getCodigo_sucursal() {
		return codigo_sucursal;
	}
	public void setCodigo_sucursal(Sucursal codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}
	
	
	
}
