package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	public List<Usuario> findAll();

	@Query("select u from usuario u where p.id=?1")
	public Usuario findById(Integer id);

}
