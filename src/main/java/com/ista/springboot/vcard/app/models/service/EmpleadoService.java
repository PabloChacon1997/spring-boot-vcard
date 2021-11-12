package com.ista.springboot.vcard.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ista.springboot.vcard.app.models.domain.Ciudad;
import com.ista.springboot.vcard.app.models.domain.Empleado;
import com.ista.springboot.vcard.app.models.domain.Sucursal;


@Service
public class EmpleadoService {
	
	
	
	public List<Empleado> getEmpleados() {
		Ciudad ciudad = new Ciudad();
		
		Sucursal sucursal = new Sucursal();
		
		Empleado empleado1 = new Empleado();
		
		empleado1.setCodigo_empleado(1);
		empleado1.setNombre_empleado("Andres Chacón");
		empleado1.setPuesto_empleado("Programador FrontEnd");
		empleado1.setHorario_empleado("Lunes-Viernes:(8:30am-6:00pm)");
		empleado1.setCorreo_empleado("pablo.chcon.est@tecazuay.edu.ec");
		empleado1.setCelular_empleado("0985647363");
		empleado1.setFoto_empleado("empleado1");
		empleado1.setPaginWeb_empleado("www.programadoresec.com");
		empleado1.setCodigo_ciudad(ciudad);
		empleado1.setCodigo_sucursal(sucursal);
		
		
		List<Empleado> listasEmpleados = new ArrayList<Empleado>();
		
		listasEmpleados.add(empleado1);
		
		return listasEmpleados;
	}
}
