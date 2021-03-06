package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.EncuentroRepository;

@Service
public class EncuentroService {

	@Autowired
	public EncuentroRepository encuentroRepository;

	public Encuentro findById(Integer idEncuentro) {
		return this.encuentroRepository.findById(idEncuentro);
	}
	
	public void crearEncuentro(Encuentro e) {
		this.encuentroRepository.save(e);
	}
	
	public void valorarEncuentro(Encuentro e) {
		this.encuentroRepository.save(e);
	}
}
