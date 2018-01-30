package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> listUsuarios() {
		return this.usuarioRepository.findAll();
	}

	public Usuario findById(Integer id) {
		return this.usuarioRepository.findById(id);
	}

}
