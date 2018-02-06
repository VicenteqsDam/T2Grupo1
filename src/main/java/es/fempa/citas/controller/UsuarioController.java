package es.fempa.citas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;

@RestController
public class UsuarioController {
	/*
	 * @GetMapping("/listadoUsuarios") public List<Usuario> listadoUsuarios() {
	 * 
	 * return null; }
	 */
	@PostMapping("/crearUsuario")
	public Usuario crearUsuario() {

		Usuario usuario = new Usuario();
		return usuario;
	}

}
