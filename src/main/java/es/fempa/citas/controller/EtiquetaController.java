package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.service.EtiquetaService;

@RestController
public class EtiquetaController {

	@Autowired
	private EtiquetaService etiquetaService;

	@PostMapping("/crearEtiqueta")
	public void crearEtiqueta(@RequestBody Etiqueta e) {

		this.etiquetaService.crearEtiqueta(e);

	}

	@GetMapping("/listadoEtiquetas")
	public List<Etiqueta> listadoEtiquetas() {
		return this.etiquetaService.listadoEtiquetas();
	}

	@GetMapping("/findByIdEtiqueta/{idEtiqueta}")
	public Etiqueta findByIdEtiqueta(@PathVariable Integer idEtiqueta) {
		return this.etiquetaService.findByIdEtiqueta(idEtiqueta);
	}

	@GetMapping("/findUsersByEtiqueta/{idEtiqueta}")
	public Etiqueta findUsersByEtiqueta(@PathVariable Integer idEtiqueta) {
		return this.etiquetaService.findByIdEtiqueta(idEtiqueta);
	}

}
