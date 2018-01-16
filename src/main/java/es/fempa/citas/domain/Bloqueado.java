package es.fempa.citas.domain;

import javax.persistence.ManyToMany;

public class Bloqueado {

	@ManyToMany
	private Usuario idUsuarioBloqueado;

	@ManyToMany
	private Usuario idUsuario;

}
