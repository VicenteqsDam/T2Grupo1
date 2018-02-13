package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class AmistadPk implements Serializable {

	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Usuario amigo;

}
