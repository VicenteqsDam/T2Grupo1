package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Interes;

public interface DatoBasicoInteresRepository extends JpaRepository<Interes, Long> {

}
