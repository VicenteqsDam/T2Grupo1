package es.fempa.citas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ciudad {
	@Id
	@GeneratedValue
	private Integer idCiudad;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Pais idPais;

	private String nombre;

	@OneToMany(mappedBy = "ciudad")
	private List<Usuario> list;
}
