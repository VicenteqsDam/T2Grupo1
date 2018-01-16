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
public class ColorPelo {
	@Id
	@GeneratedValue
	private Integer idColorPelo;

	private String nombre;

	@OneToMany(mappedBy = "colorPelo")
	private List<Usuario> list;
}
