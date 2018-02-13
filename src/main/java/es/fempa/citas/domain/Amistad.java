package es.fempa.citas.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Amistad {

	@EmbeddedId
	private AmistadPk id;
<<<<<<< HEAD

=======
>>>>>>> master
}
