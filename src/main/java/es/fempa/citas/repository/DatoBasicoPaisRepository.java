package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Pais;

public interface DatoBasicoPaisRepository extends JpaRepository<Pais, Long> {

}
