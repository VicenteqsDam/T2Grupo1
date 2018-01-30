package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	private Pais Pais;

	private String nombre;

}
