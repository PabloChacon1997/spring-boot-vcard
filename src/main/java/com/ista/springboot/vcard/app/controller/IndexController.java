package com.ista.springboot.vcard.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.vcard.app.models.domain.Empleado;
import com.ista.springboot.vcard.app.models.service.EmpleadoService;

@Controller
@RequestMapping("/vcard")
public class IndexController {
	
	
	@Autowired
	private EmpleadoService empleadoService;
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado> empleados = empleadoService.getEmpleados();
		model.addAttribute("titulo", "Lista de empleados");
		model.addAttribute("empleados", empleados);
		return "index";
	}
	
	
	@GetMapping("/ver/{codigo}")
	public String ver(@PathVariable Integer codigo ,Model model) {
		List<Empleado> empleados = empleadoService.getEmpleados();
		Empleado empleado = empleadoService.getEmpleado(codigo, empleados);
		model.addAttribute("titulo", "VCard");
		model.addAttribute("empleado", empleado);
		return "vcard/ver";
	}
}
