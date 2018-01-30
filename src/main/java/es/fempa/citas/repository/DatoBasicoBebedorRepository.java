package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Bebedor;

public interface DatoBasicoBebedorRepository extends JpaRepository<Bebedor, Long> {

}
