package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EncuentroDescripcion {

	@ManyToMany
	@PrimaryKeyJoinColumn
	private Encuentro idEncuentro;

	@ManyToMany
	@PrimaryKeyJoinColumn
	private Descripcion idDescripcion;
}
