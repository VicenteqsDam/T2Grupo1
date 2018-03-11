package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.BusquedaService;

@RestController
public class BusquedaController {

	@Autowired
	private BusquedaService busquedaService;

	@GetMapping("/busqueda")
	public List<Usuario> busquedaGenerales() {

		return this.busquedaService.busquedaGeneral();
	}

}
