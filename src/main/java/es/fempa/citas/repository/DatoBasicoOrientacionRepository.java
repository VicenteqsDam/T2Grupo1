package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Orientacion;

public interface DatoBasicoOrientacionRepository extends JpaRepository<Orientacion, Long> {

}
