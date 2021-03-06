package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.repository.EtiquetaRepository;

@Service
public class EtiquetaService {

	@Autowired
	public EtiquetaRepository etiquetaRepository;

	public Etiqueta findByIdEtiqueta(Integer idEtiqueta) {

		return this.etiquetaRepository.findByIdEtiqueta(idEtiqueta);

	}

	public List<Etiqueta> listadoEtiquetas() {
		return this.etiquetaRepository.findAll();
	}

	public void crearEtiqueta(Etiqueta e) {
		this.etiquetaRepository.save(e);
	}

	public void editarEiqueta(Etiqueta e) {
		System.out.println(e.getNombre() + ", " + e.getFoto()  + ", " +  e.getUsuario() + ", " +  e.getIdEtiqueta()); 
		this.etiquetaRepository.editarEtiqueta(e.getNombre(), e.getFoto(), e.getUsuario(), e.getIdEtiqueta());
//		this.etiquetaRepository.save(e);
	}
}
