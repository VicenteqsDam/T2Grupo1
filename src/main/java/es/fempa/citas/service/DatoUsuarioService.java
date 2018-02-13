package es.fempa.citas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.DatosUsuarioRepository;

@Service
public class DatoUsuarioService {

	@Autowired
	public DatosUsuarioRepository datosUsuarioRepository;

	public Usuario datosUsuario(Integer id) {

		return this.datosUsuarioRepository.findDatosUsuarioById(id);

	}

}
