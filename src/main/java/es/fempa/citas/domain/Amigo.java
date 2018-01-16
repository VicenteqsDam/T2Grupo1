package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Amigo {

	@ManyToMany
	private Usuario idAmigo;

	@ManyToMany
	private Usuario idUsuario;
	private Boolean pendiente;
}
