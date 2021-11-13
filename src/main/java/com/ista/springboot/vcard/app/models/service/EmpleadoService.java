package com.ista.springboot.vcard.app.models.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.springboot.vcard.app.models.domain.Ciudad;
import com.ista.springboot.vcard.app.models.domain.Empleado;
import com.ista.springboot.vcard.app.models.domain.Sucursal;





@Service
public class EmpleadoService {
	
	@Autowired
	private Ciudad ciudad;
	
	@Autowired
	private Sucursal sucursal;
	
	public List<Empleado> getEmpleados() {
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		
		empleado1.setCodigo_empleado(1);
		empleado1.setNombre_empleado("Pablo Andres Chacón Tello");
		empleado1.setPuesto_empleado("Programador FrontEnd");
		empleado1.setHorario_empleado("Lunes-Viernes:(8:30am-6:00pm)");
		empleado1.setCorreo_empleado("pablo.chacon.est@tecazuay.edu.ec");
		empleado1.setCelular_empleado("985647363");
		empleado1.setFoto_empleado("empleado1.jpg");
		empleado1.setPaginWeb_empleado("www.programadoresec.com");
		empleado1.setCodigo_ciudad(ciudad);
		empleado1.setCodigo_sucursal(sucursal);
		
		empleado2.setCodigo_empleado(2);
		empleado2.setNombre_empleado("Ramon Alvarez de Mon");
		empleado2.setPuesto_empleado("Programador Backend");
		empleado2.setHorario_empleado("Lunes-Viernes:(9:30am-7:00pm)");
		empleado2.setCorreo_empleado("ramon.alvarez@gmail.com");
		empleado2.setCelular_empleado("9936485763");
		empleado2.setFoto_empleado("empleado2.jpg");
		empleado2.setPaginWeb_empleado("www.programadoresec.com");
		empleado2.setCodigo_ciudad(ciudad);
		empleado2.setCodigo_sucursal(sucursal);
		
		
		List<Empleado> listasEmpleados = new ArrayList<Empleado>();
		
		listasEmpleados.add(empleado1);
		listasEmpleados.add(empleado2);
		
		return listasEmpleados;
	}
	
	
	public Empleado getEmpleado(int codigo, List<Empleado> empleados) {
		Iterator<Empleado> iterator = empleados.iterator();
	    while (iterator.hasNext()) {
	        Empleado empleado = iterator.next();
	        if (empleado.getCodigo_empleado().equals(codigo)) {
	            return empleado;
	        }
	    }
		return null;
	}
}
