package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.domain.Pais;

public interface DatoBasicoPaisRepository extends JpaRepository<Pais, Integer> {

	@Query("select c from Ciudad c join c.pais p where p.idPais = ?1")
	List<Ciudad> findCiudadesById(Integer id);

}
