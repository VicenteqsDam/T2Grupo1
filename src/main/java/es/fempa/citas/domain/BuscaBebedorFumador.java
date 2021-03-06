package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BuscaBebedorFumador {
	@Id
	@GeneratedValue
	private Integer idBuscaBebedorFumador;

	private String nombre;

}
