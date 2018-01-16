package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioInteres {

	@ManyToMany
	private Usuario idUsuarioInteres;

	@ManyToMany
	private Interes idInteres;

}
