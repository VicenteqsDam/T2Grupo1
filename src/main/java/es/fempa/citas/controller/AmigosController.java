package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.AmigosService;

@RestController
public class AmigosController {

	@Autowired
	private AmigosService amigosService;

	@GetMapping("/listadoUsuarios")
	public List<Usuario> listadoUsuarios(Integer id) {
		return this.amigosService.listadoUsuarios(id);
	}

	@DeleteMapping
	public void deleteAmigo(Integer id) {
		this.amigosService.deleteAmigo(id);
	}
}
