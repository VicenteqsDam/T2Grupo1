package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.AmigosRepository;

@Service
public class AmigosService {

	@Autowired
	public AmigosRepository amigosRepository;

	public List<Usuario> listadoAmigos(Usuario u) {
		return this.amigosRepository.findAmigos(u);
	}

	public void deleteAmigo(Integer id) {
		this.amigosRepository.delete(id);
	}

}
