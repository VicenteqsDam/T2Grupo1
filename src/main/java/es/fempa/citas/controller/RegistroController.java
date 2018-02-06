package es.fempa.citas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.RegistroService;

@RestController
public class RegistroController {

	@Autowired
	private RegistroService registroService;

	@PostMapping("/anadirUsuario")
	public void anadirUsuario(@RequestBody Usuario u) {

		this.registroService.anadirUsuario(u);
	}

}
