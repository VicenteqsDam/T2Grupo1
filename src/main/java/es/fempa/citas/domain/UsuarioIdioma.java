package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioIdioma {

	@ManyToMany
	private Usuario idUsuario;

	@ManyToMany
	private Integer idIdioma;

}