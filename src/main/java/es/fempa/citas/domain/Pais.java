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
public class Pais {
	@Id
	@GeneratedValue
	private Integer idPais;
	private String nombre;

	@OneToMany(mappedBy = "pais")
	private List<Usuario> list;

	@OneToMany(mappedBy = "paisOrigen")
	private List<Usuario> listOrigen;
}
