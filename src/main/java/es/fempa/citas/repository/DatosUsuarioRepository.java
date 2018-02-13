package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Usuario;

public interface DatosUsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("select u from Usuario u where u.idUsuario = ?1")
	Usuario findDatosUsuarioById(Integer id);

}
