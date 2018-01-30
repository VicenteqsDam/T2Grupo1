package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Amistad {

	// @EmbeddedId
	// private AmistadPk id;

	@Id
	private Integer id;
}
