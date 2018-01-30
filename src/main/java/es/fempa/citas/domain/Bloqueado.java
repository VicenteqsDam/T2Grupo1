package es.fempa.citas.domain;

import javax.persistence.ManyToMany;

public class Bloqueado {

	@ManyToMany
	private Usuario UsuarioBloqueado;

	@ManyToMany
	private Usuario Usuario;

}
