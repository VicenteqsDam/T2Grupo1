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
	private Usuario idUsuarioSolicitante;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Usuario idUsuarioSolicitado;

	private boolean aceptado;
	private Integer valoracion;
	private String comentariosSolicitante;
	private String comentariosSolicitado;
	private Integer valoracionSolicitante;
	private Integer valoracionSolicitado;

}
