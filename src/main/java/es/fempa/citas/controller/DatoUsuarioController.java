package es.fempa.citas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.DatoUsuarioService;

@RestController
public class DatoUsuarioController {

	@Autowired
	public DatoUsuarioService datoUsuarioService;

	@GetMapping("/listadoDatosUsuario/{id}")
	public Usuario datosUsuario(@PathVariable Integer id) {

		return this.datoUsuarioService.datosUsuario(id);
	}

}
