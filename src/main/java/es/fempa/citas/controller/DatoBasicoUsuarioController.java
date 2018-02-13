package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Bebedor;
import es.fempa.citas.domain.BuscaBebedorFumador;
import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.domain.ColorOjos;
import es.fempa.citas.domain.ColorPelo;
import es.fempa.citas.domain.Fumador;
import es.fempa.citas.domain.Interes;
import es.fempa.citas.domain.Orientacion;
import es.fempa.citas.domain.Pais;
import es.fempa.citas.domain.Sexo;
import es.fempa.citas.service.DatoBasicoUsuarioService;

@RestController
public class DatoBasicoUsuarioController {

	@Autowired
	public DatoBasicoUsuarioService datoBasicoUsuarioService;

	@GetMapping("/listadoSexo")
	public List<Sexo> listadoSexo() {

		return this.datoBasicoUsuarioService.listadoSexo();
	}

	@GetMapping("/listadoColorOjos")
	public List<ColorOjos> listadoColorOjos() {

		return this.datoBasicoUsuarioService.listadoColorOjos();
	}

	@GetMapping("/listadoColorPelo")
	public List<ColorPelo> listadoColorPelo() {

		return this.datoBasicoUsuarioService.listadoColorPelo();
	}

	@GetMapping("/listadoOrientacion")
	public List<Orientacion> listadoOrientacion() {

		return this.datoBasicoUsuarioService.listadoOrientacion();
	}

	@GetMapping("/listadoBuscaBebedorFumador")
	public List<BuscaBebedorFumador> listadoBuscaBebedorFumador() {

		return this.datoBasicoUsuarioService.listadoBuscaBebedorFumador();
	}

	@GetMapping("/listadoCiudadesPorPais/{id}")
	public List<Ciudad> listadoCiudad(@PathVariable Integer id) {

		return this.datoBasicoUsuarioService.findCiudadesById(id);
	}

	@GetMapping("/listadoIntereses")
	public List<Interes> listadoIntereses() {

		return this.datoBasicoUsuarioService.listadoIntereses();
	}

	@GetMapping("/listadoBebedor")
	public List<Bebedor> listadoBebedor() {

		return this.datoBasicoUsuarioService.listadoBebedor();
	}

	@GetMapping("/listadoFumador")
	public List<Fumador> listadoFumador() {

		return this.datoBasicoUsuarioService.listadoFumador();
	}

	@GetMapping("/listadoPais")
	public List<Pais> listadoPais() {

		return this.datoBasicoUsuarioService.listadoPais();
	}

}
