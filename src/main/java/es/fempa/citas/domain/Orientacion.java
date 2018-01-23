package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Orientacion {
	@Id
	@GeneratedValue
	private Integer idOrientacion;

	private String nombre;

}
