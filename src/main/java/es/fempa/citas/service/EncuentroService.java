package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.repository.EncuentroRepository;

@Service
public class EncuentroService {

	@Autowired
	public EncuentroRepository encuentroRepository;

	public List<Encuentro> findById(Integer id_encuentro) {
		return this.encuentroRepository.findById(id_encuentro);
	}
}
