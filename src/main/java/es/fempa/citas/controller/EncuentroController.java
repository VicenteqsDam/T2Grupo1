package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.service.EncuentroService;

@RestController
public class EncuentroController {
	@Autowired
	private EncuentroService encuentroService;
	
	@GetMapping("/listadoEncuentros/{id_encuentro}")
	public List<Encuentro> findById(@PathVariable Integer id_encuentro) {
		return this.encuentroService.findById(id_encuentro);
	}
}
