package es.fempa.citas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NivelEstudio {
	@Id
	@GeneratedValue
	private Integer idNivelEstudios;

	private String nombre;

	@OneToMany(mappedBy = "nivelEstudios")
	private List<Usuario> list;
}
