package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ColorOjos {
	@Id
	@GeneratedValue
	private Integer idColorOjos;

	private String nombre;

}
