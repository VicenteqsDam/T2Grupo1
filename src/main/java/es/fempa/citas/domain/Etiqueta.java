package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	private Usuario idUsuario;

	private String foto;

}
