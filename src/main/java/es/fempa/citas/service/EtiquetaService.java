package es.fempa.citas.service;

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
}
