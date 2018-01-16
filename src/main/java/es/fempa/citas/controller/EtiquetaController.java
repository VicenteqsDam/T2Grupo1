package es.fempa.citas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Etiqueta;
public class EtiquetaController {

	@PostMapping("/crearEtiqueta")
	public Etiqueta crearEtiqueta() {

		Etiqueta etiqueta = new Etiqueta();
		return etiqueta;
	}

	
	@GetMapping("/listadoEtiquetas")
	public List<Etiqueta> listadoEtiquetas(){
		
		return null;
	}
}
