package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Idioma {

	@Id
	@GeneratedValue
	private Integer idIdioma;

	private String nombre;

}
