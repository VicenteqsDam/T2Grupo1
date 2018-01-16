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
public class BuscaBebedorFumador {
	@Id
	@GeneratedValue
	private Integer idBuscaBebedorFumador;

	private String nombre;

	@OneToMany(mappedBy = "buscaFumadorBebedor")
	private List<Usuario> list;
}
