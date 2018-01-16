package es.fempa.citas.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue
	private Integer idUsuario;

	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;

	@ManyToOne
	private Ciudad ciudad;
	@ManyToOne
	private Pais pais;
	@ManyToOne
	private Pais paisOrigen;

	private Integer codigoPostal;

	@ManyToOne
	private Sexo sexo;

	private String password;
	private double altura;
	private double peso;
	private String fotoPerfil;

	@ManyToOne
	private ColorPelo colorPelo;
	@ManyToOne
	private ColorOjos colorOjos;

	private String descripcion;

	@ManyToOne
	private NivelEstudio nivelEstudios;
	private boolean tipoPerfil;

	@ManyToOne
	private Bebedor bebedor;
	@ManyToOne
	private Fumador fumador;
	@ManyToOne
	private Ocupacion ocupacion;

	@ManyToOne
	private BuscaBebedorFumador buscaFumadorBebedor;

	private Integer edadMax;
	private Integer edadMin;

	@ManyToOne
	private Orientacion orientacion;

	private String correoElectronico;

}
