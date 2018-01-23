package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.BusquedaRepository;

@Service
public class BusquedaService {

	@Autowired
	public BusquedaRepository busquedaRepository;

	public List<Usuario> busquedaGeneral() {
		return this.busquedaRepository.findAll();
	}

}
