package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class SolicitudPk implements Serializable {

	private Usuario solicitante;

	private Usuario solicitado;

}
