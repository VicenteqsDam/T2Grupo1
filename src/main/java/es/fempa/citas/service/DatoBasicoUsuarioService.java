package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import es.fempa.citas.repository.DatoBasicoBebedorRepository;
import es.fempa.citas.repository.DatoBasicoBuscaBebedorFumadorRepository;
import es.fempa.citas.repository.DatoBasicoCiudadRepository;
import es.fempa.citas.repository.DatoBasicoColorOjosRepository;
import es.fempa.citas.repository.DatoBasicoColorPeloRepository;
import es.fempa.citas.repository.DatoBasicoFumadorRepository;
import es.fempa.citas.repository.DatoBasicoInteresRepository;
import es.fempa.citas.repository.DatoBasicoOrientacionRepository;
import es.fempa.citas.repository.DatoBasicoPaisRepository;
import es.fempa.citas.repository.DatoBasicoSexoRepository;

@Service
public class DatoBasicoUsuarioService {

	@Autowired
	public DatoBasicoSexoRepository datoBasicoUsuarioRepository;
	@Autowired
	public DatoBasicoColorOjosRepository datoBasicoColorOjosRepository;
	@Autowired
	public DatoBasicoColorPeloRepository datoBasicoColorPeloRepository;
	@Autowired
	public DatoBasicoOrientacionRepository datoBasicoOrientacionRepository;
	@Autowired
	public DatoBasicoBuscaBebedorFumadorRepository datoBasicoBuscaBebedorFumadorRepository;
	@Autowired
	public DatoBasicoCiudadRepository datoBasicoCiudadRepository;
	@Autowired
	public DatoBasicoInteresRepository datoBasicoInteresRepository;
	@Autowired
	public DatoBasicoBebedorRepository datoBasicoBebedorRepository;
	@Autowired
	public DatoBasicoFumadorRepository datoBasicoFumadorRepository;
	@Autowired
	public DatoBasicoPaisRepository datoBasicoPaisRepository;

	public List<Sexo> listadoSexo() {
		return this.datoBasicoUsuarioRepository.findAll();
	}

	public List<ColorOjos> listadoColorOjos() {
		return this.datoBasicoColorOjosRepository.findAll();
	}

	public List<ColorPelo> listadoColorPelo() {
		return this.datoBasicoColorPeloRepository.findAll();
	}

	public List<Orientacion> listadoOrientacion() {
		return this.datoBasicoOrientacionRepository.findAll();
	}

	public List<BuscaBebedorFumador> listadoBuscaBebedorFumador() {

		return this.datoBasicoBuscaBebedorFumadorRepository.findAll();
	}

	public List<Ciudad> listadoCiudad() {

		return this.datoBasicoCiudadRepository.findAll();
	}

	public List<Interes> listadoIntereses() {

		return this.datoBasicoInteresRepository.findAll();
	}

	public List<Bebedor> listadoBebedor() {

		return this.datoBasicoBebedorRepository.findAll();
	}

	public List<Fumador> listadoFumador() {

		return this.datoBasicoFumadorRepository.findAll();
	}

	public List<Pais> listadoPais() {

		return this.datoBasicoPaisRepository.findAll();
	}

}
