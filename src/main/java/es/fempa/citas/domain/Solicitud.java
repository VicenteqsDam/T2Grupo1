package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Solicitud {

	private Long idSolicitante;

	private Long idSolicitado;

	private boolean pendiente;

}
