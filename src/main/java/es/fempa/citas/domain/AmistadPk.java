package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class AmistadPk implements Serializable {

	private Usuario usuario;

	private Usuario amigo;

}
