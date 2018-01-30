package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Encuentro;

public interface EncuentroRepository extends JpaRepository<Encuentro, Integer>{
	
	@Query("select e from encuentro e where e.usuario_solicitante_id_usuario=?")
	public List<Encuentro> findById(Integer id);
}
