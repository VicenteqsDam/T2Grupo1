package es.fempa.citas.domain;

import java.util.Date;

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
public class Encuentro {

	@Id
	@GeneratedValue
	private Integer idEncuentro;

	private String lugar;
	private Date fecha;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Usuario UsuarioSolicitante;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Usuario UsuarioSolicitado;

	/*
	 * @OneToMany
	 * 
	 * @JoinTable(name = "ListDescrip", joinColumns = @JoinColumn(name =
	 * "idDescripcion", referencedColumnName = "idDescripcion")) private
	 * List<Descripcion> listadoDescripciones;
	 */
	private boolean aceptado;
	private Integer valoracion;
	private String comentariosSolicitante;
	private String comentariosSolicitado;
	private Integer valoracionSolicitante;
	private Integer valoracionSolicitado;

}
