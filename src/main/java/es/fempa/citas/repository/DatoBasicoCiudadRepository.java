package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Ciudad;

public interface DatoBasicoCiudadRepository extends JpaRepository<Ciudad, Long> {

}
