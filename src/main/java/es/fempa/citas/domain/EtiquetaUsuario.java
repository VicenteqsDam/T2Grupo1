package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EtiquetaUsuario {

	@ManyToMany
	@PrimaryKeyJoinColumn
	private Usuario idUsuarioQuePone;

	@ManyToMany
	private Etiqueta idEtiqueta;

	@ManyToMany
	@PrimaryKeyJoinColumn
	private Usuario idUsuarioPuesto;

}
