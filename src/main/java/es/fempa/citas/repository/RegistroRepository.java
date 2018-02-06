package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Usuario;

public interface RegistroRepository extends JpaRepository<Usuario, Integer> {

}