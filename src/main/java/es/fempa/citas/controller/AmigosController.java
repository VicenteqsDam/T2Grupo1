package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.AmigosService;

@RestController
public class AmigosController {

	@Autowired
	private AmigosService amigosService;

	@GetMapping("/listadoAmigos/{id}")
	public List<Usuario> listadoAmigos(@PathVariable Integer id) {
		return this.amigosService.listadoAmigos(id);
	}

	@DeleteMapping("/deleteAmigo/{id}")
	public void deleteAmigo(@PathVariable Integer id) {
		this.amigosService.deleteAmigo(id);
	}
}
