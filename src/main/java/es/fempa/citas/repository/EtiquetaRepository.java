package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Etiqueta;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Long> {

	@Query("select b from Bebedor b")
	Etiqueta findByIdEtiqueta(Integer idEtiqueta);
}
