package es.fempa.citas.domain;

import java.sql.Date;

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
public class Mensaje {
	@Id
	@GeneratedValue
	private Integer idMensaje;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Usuario idUsuarioRecibe;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Usuario idUsuarioManda;

	private String mensaje;

	private Date fecha;
	private Date hora;
}
