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
public class Etiqueta {

	@Id
	@GeneratedValue
	private Integer idEtiqueta;

	private String nombre;

	@ManyToOne
	// @JsonIgnore
	private Usuario usuario;

	private String foto;

}
