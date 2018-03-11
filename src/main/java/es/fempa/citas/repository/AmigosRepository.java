package es.fempa.citas.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Usuario;

public interface AmigosRepository extends JpaRepository<Usuario, Integer> {

	@Query("select a.amigo from Amistad a where a.id.usuario.idUsuario = ?1")
	public List<Usuario> findAmigos(Integer id);
	
	@Modifying
    @Transactional
    @Query("delete from Amistad a where a.id.amigo.idUsuario = ?1")
	public void deleteAmigo(Integer id);
}
