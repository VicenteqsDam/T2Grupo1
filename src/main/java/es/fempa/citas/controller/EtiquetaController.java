package es.fempa.citas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import es.fempa.citas.domain.Etiqueta;

public class EtiquetaController {
	
	@GetMapping("/listadoEtiquetas")
	public List<Etiqueta> listadoEtiquetas(){
		
		return null;
	}
}
