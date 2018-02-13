package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Usuario;

public interface AmigosRepository extends JpaRepository<Usuario, Integer> {

	@Query("select a from Amistad a where a.id.usuario = ?1")
	public List<Usuario> findAmigos(Usuario u);
}
