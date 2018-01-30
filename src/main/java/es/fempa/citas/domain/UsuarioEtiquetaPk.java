package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class UsuarioEtiquetaPk implements Serializable {

	private Usuario UsuarioQuePone;

	private Usuario UsuarioPuesto;

}
