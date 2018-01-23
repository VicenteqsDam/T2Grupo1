package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Solicitud {

	@OneToMany
	private Long idSolicitante;

	@OneToMany
	private Long idSolicitado;

	private Boolean pendiente;

}
