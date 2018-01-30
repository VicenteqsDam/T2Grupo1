package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Sexo;

public interface DatoBasicoSexoRepository extends JpaRepository<Sexo, Long> {

}
