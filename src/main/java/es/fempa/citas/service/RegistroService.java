package es.fempa.citas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.RegistroRepository;

@Service
public class RegistroService {

	@Autowired
	public RegistroRepository registroRepository;

	public void anadirUsuario(Usuario u) {
		this.registroRepository.save(u);
	}

}
