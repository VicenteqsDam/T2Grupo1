package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EtiquetaUsuario {

	/*
	 * @EmbeddedId private UsuarioEtiquetaPk id;
	 */
	@Id
	private Integer id;

	@OneToOne
	private Etiqueta Etiqueta;

}
