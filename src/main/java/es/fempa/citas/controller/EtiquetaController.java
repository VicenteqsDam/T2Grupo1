package es.fempa.citas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Etiqueta;

@RestController
public class EtiquetaController {

	@PostMapping("/crearEtiqueta")
	public Etiqueta crearEtiqueta() {

		Etiqueta etiqueta = new Etiqueta();
		return etiqueta;
	}

}
