package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private Pais pais;

	private String nombre;

}
