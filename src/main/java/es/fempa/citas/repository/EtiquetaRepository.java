package es.fempa.citas.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.domain.Usuario;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {

	@Query("select e from Etiqueta e where e.idEtiqueta = ?1")
	Etiqueta findByIdEtiqueta(Integer idEtiqueta);

	@Query("select u.nombre from Etiqueta e join e.usuario u where e.idEtiqueta = ?")
	Etiqueta findUsersByEtiqueta(Integer idEtiqueta);
	
	@Modifying
	@Transactional
	@Query("update Etiqueta e set e.nombre = :nombre, e.foto = :foto, e.usuario = :usuario  where e.idEtiqueta = :id")
	public void editarEtiqueta(@Param("nombre") String nombre,@Param("foto") String foto,@Param("usuario") Usuario usua,@Param("id") Integer id);

}
