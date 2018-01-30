package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Etiqueta;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {

	@Query("select e from Etiqueta e where e.idEtiqueta = ?1")
	Etiqueta findByIdEtiqueta(Integer idEtiqueta);

}
