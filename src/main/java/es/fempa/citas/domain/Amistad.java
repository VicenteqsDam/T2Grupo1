package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Amistad {

	private Long idUsuario;

	private Long idAmigo;

}
