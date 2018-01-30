package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Solicitud {

	/*
	 * @EmbeddedId private SolicitudPk id;
	 */

	@Id
	private Integer id;

	private boolean pendiente;

}
